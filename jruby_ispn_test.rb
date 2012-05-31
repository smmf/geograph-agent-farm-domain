require 'java'


CURRENT_PATH = File.expand_path File.dirname(__FILE__)
DML_CONF_PATH = File.join(CURRENT_PATH, 'src', 'common', 'dml')
ISPN_CONF_PATH = File.join(CURRENT_PATH, 'config')
$CLASSPATH << ISPN_CONF_PATH

# load the jars
LIB_PATH = File.join(CURRENT_PATH, 'lib')
$CLASSPATH << LIB_PATH
Dir[File.join(LIB_PATH, '*.jar')].each{|jar|
  #puts "Loading JAR: #{jar}"
  require jar
}

# load the domain model jar
DIST_PATH = File.join(CURRENT_PATH, 'dist')
$CLASSPATH << DIST_PATH
require File.join(DIST_PATH, 'geograph-agent-farm-domain.jar')

# Load Fenix Framework
FenixConfig = Java::PtIstFenixframework::Config
FenixFramework = Java::PtIstFenixframework::FenixFramework

# Load the domain models
MyRoute = Java::ItAlgoGeographAgentfarmDomain::Route
Position = Java::ItAlgoGeographAgentfarmDomain::Position
AgentGroup = Java::ItAlgoGeographAgentfarmDomain::AgentGroup
Agent = Java::ItAlgoGeographAgentfarmDomain::Agent
BloggerAgent = Java::ItAlgoGeographAgentfarmDomain::BloggerAgent

FenixRoot = Java::ItAlgoGeographAgentfarmDomain::Root

# Load the CloudTM glue framework
CloudTmInit = Java::OrgCloudtmFramework::Init
CloudTmTxSystem = Java::OrgCloudtmFramework::TxSystem
CloudTmConfig = Java::OrgCloudtmFramework::CloudtmConfig


#FenixTransactionManager = Java::OrgCloudtmFrameworkFenix::FFTxManager
IspnTransactionManager = Java::OrgCloudtmFrameworkIspn::IspnTxManager
IllegalWriteException = Java::PtIstFenixframeworkPstm::IllegalWriteException
CommitException = Java::Jvstm::CommitException
WriteOnReadException = Java::Jvstm::WriteOnReadException
UnableToDetermineIdException = Java::PtIstFenixframeworkPstm::AbstractDomainObject::UnableToDetermineIdException


class TmpIspnTransactionManager
  def withTransaction(&block)
    result = nil
    try_read_only = true

    while(true) do
      Java::PtIstFenixframeworkPstm::Transaction.begin(try_read_only)
      finished = false
      begin
        result = block.call
        Java::PtIstFenixframeworkPstm::Transaction.commit
        finished = true
        return result
      rescue CommitException => ce
        FenixTransaction.abort
        finished = true
      rescue WriteOnReadException => wore
        puts "jvstm.WriteOnReadException"
        Java::PtIstFenixframeworkPstm::Transaction.abort
        finished = true
        try_read_only = false
      rescue UnableToDetermineIdException => unableToDetermineIdException
        puts "Restaring TX: unable to determine id. Cause: #{unableToDetermineIdException.getCause}"
        puts unableToDetermineIdException.to_s
        Java::PtIstFenixframeworkPstm::Transaction.abort
        finished = true
      ensure
        unless finished
          Java::PtIstFenixframeworkPstm::Transaction.abort
        end
      end
    end
  end

end

# In order to bypass the use of the constructor with closure, that causes problems
# in the jruby binding.
# Here we open the Fenix Config class and we define a method that permits to
# valorize the same protected variables managed by the standard constructor.
class FenixConfig
  # Accepts an hash of params, keys are instance variables of FenixConfig class
  # and values are used to valorize these variables.
  def init params
    params.each do |name, value|
      set_param(name, value)
    end
  end

  private

  # Sets an instance variable value.
  def set_param(name, value)
    # Jruby doesn't offer accessors for the protected variables.
    field = self.java_class.declared_field name
    field.accessible = true
    field.set_value Java.ruby_to_java(self), Java.ruby_to_java(value)
  end
end

class CloudTmTransactionManager
  #cattr_accessor :manager

  class << self
    def manager
      @manager
    end

    def manager=(man)
      @manager = man
    end
  end
end

# This is the Fenix Framework loader. It provides a simple way to
# run the framework initialization process.
class FenixLoader
  # Load the Fenix Framework.
  # Options:
  # => dml: the dml file name
  # => conf: the configuration file name
  # => root: the root class
  def self.load(options)
    config = FenixConfig.new
    config.init(
      :domainModelPath => File.join(DML_CONF_PATH, options[:dml]),
      :dbAlias => File.join(ISPN_CONF_PATH, options[:conf]),
      :rootClass => FenixRoot.java_class,
      :repositoryType => FenixConfig::RepositoryType::INFINISPAN
    )

    CloudTmInit.initializeTxSystem(config, CloudTmConfig::Framework::ISPN)
    CloudTmTransactionManager.manager = CloudTmTxSystem.getManager
  end
end

class MyRoute
  class << self

    def create attrs = {}
      manager = CloudTmTransactionManager.manager
      manager.withTransaction do

        instance = new
        attrs.each do |attr, value|
          instance.send("#{attr}=", value)
        end
        manager.save instance
        instance.set_root manager.getRoot
      end
    end

  end
end

class Position
  class << self
    def create route, attrs = {}
      #manager = CloudTmTransactionManager.manager
      #manager.withTransaction do

        instance = new
        attrs.each do |attr, value|
          instance.send("#{attr}=", value)
        end
        CloudTmTransactionManager.manager.save instance
        route.addPositions(instance)
#      end
    end
  end

  def destroy
    _route = getRoute
    _route.removePositions(self) if _route
  end
end


class AgentGroup
  class << self
    def create attrs = {}
      manager = CloudTmTransactionManager.manager
      #manager.withTransaction do

        instance = new
        attrs.each do |attr, value|
          instance.send("#{attr}=", value)
        end
        manager.save instance
        manager.getRoot.addAgentGroups(instance)
        instance
#      end
    end
  end

  def destroy
    CloudTmTransactionManager.manager.getRoot.removeAgentGroups(self)
  end
end

class Agent
  class << self
    def create group, attrs = {}
      manager = CloudTmTransactionManager.manager
      #manager.withTransaction do

        instance = new
        attrs.each do |attr, value|
          instance.send("#{attr}=", value)
        end
        manager.save instance
        group.addAgents(instance)
#      end
    end
  end

  def destroy
    getAgentGroup.removeAgents(self)
  end
end

class BloggerAgent
  def alter_me(attrs)
    attrs.each do |attr, value|
      send("#{attr}=", value)
    end
  end

end


FenixLoader.load({
    :dml => 'geograph-agentfarm.dml',
    :conf => 'infinispanFile.xml'
  })

_manager = CloudTmTransactionManager.manager


puts "manager #{_manager}"
_manager.withTransaction do
  puts "in transaction!"
  puts "Routes size #{_manager.getRoot.getRoutes.size}"
end

MyRoute.create(:name => 'test-route')


_manager.withTransaction do
  puts _manager.getRoot.getRoutes.size
  _manager.getRoot.getRoutes.each do |route|
    next if route.name != 'test-route'
    puts "Creating position"
    Position.create(route, {
        :latitude => java.math.BigDecimal.new("72.6426"),
        :longitude => java.math.BigDecimal.new("32.5425")
      })
  end
end

_manager.withTransaction do
  _manager.getRoot.getRoutes.each do |route|
    next if route.name != 'test-route'
    puts route.inspect
    route.getPositions.each do |position|
      puts "Destroying position #{position.oid} with lat: #{position.latitude} - lon: #{position.longitude}"
      position.destroy
      #route.removePositions(position)
    end
  end
end

_manager.withTransaction do
  _manager.getRoot.getRoutes.each do |route|
    next if route.name != 'test-route'
    if route.getPositions.any?
      raise "Position not removed correctly!"
    end
  end
end

# inheritance test
_manager.withTransaction do
  AgentGroup.create(:name => 'test-group')
  _manager.getRoot.getAgentGroups.each do |group|
    next if group.name != 'test-group'
    BloggerAgent.create(group, {:status => 'idle'})
  end
end

_manager.withTransaction do
  _manager.getRoot.getAgentGroups.each do |group|
    next if group.name != 'test-group'
    blogger_agent = group.getAgents.first
    puts blogger_agent.class
    puts blogger_agent.status
    blogger_agent.alter_me(:perception_status => 'ok', :status => 'started')
    puts blogger_agent.perception_status
    puts blogger_agent.status
  end

  options = {"name"=>"bloggers", "agents_type"=>"BloggerAgent", "delay"=> 5}
  group = AgentGroup.create(options)
  puts group.agents_type
  group.agents_type = nil
end
