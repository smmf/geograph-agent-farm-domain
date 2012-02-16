package it.algo.geograph.agentfarm.domain;

import pt.ist.fenixframework.pstm.VBox;
import pt.ist.fenixframework.pstm.RelationList;
import pt.ist.fenixframework.ValueTypeSerializationGenerator.*;
public abstract class AgentGroup_Base extends pt.ist.fenixframework.pstm.OneBoxDomainObject {
    public static pt.ist.fenixframework.pstm.dml.RoleOne<it.algo.geograph.agentfarm.domain.AgentGroup,it.algo.geograph.agentfarm.domain.Root> role$$root = new pt.ist.fenixframework.pstm.dml.RoleOne<it.algo.geograph.agentfarm.domain.AgentGroup,it.algo.geograph.agentfarm.domain.Root>() {
        public it.algo.geograph.agentfarm.domain.Root getValue(it.algo.geograph.agentfarm.domain.AgentGroup o1) {
            return ((AgentGroup_Base.DO_State)o1.get$obj$state(false)).root;
        }
        public void setValue(it.algo.geograph.agentfarm.domain.AgentGroup o1, it.algo.geograph.agentfarm.domain.Root o2) {
            ((AgentGroup_Base.DO_State)o1.get$obj$state(true)).root = o2;
        }
        public dml.runtime.Role<it.algo.geograph.agentfarm.domain.Root,it.algo.geograph.agentfarm.domain.AgentGroup> getInverseRole() {
            return it.algo.geograph.agentfarm.domain.Root.role$$agentGroups;
        }
        
    };
    public static dml.runtime.RoleMany<it.algo.geograph.agentfarm.domain.AgentGroup,it.algo.geograph.agentfarm.domain.Agent> role$$agents = new dml.runtime.RoleMany<it.algo.geograph.agentfarm.domain.AgentGroup,it.algo.geograph.agentfarm.domain.Agent>() {
        public dml.runtime.RelationBaseSet<it.algo.geograph.agentfarm.domain.Agent> getSet(it.algo.geograph.agentfarm.domain.AgentGroup o1) {
            return ((AgentGroup_Base)o1).get$rl$agents();
        }
        public dml.runtime.Role<it.algo.geograph.agentfarm.domain.Agent,it.algo.geograph.agentfarm.domain.AgentGroup> getInverseRole() {
            return it.algo.geograph.agentfarm.domain.Agent.role$$agentGroup;
        }
        
    };
    public static pt.ist.fenixframework.pstm.LoggingRelation<it.algo.geograph.agentfarm.domain.AgentGroup,it.algo.geograph.agentfarm.domain.Root> RootHasAgentGroups = new pt.ist.fenixframework.pstm.LoggingRelation<it.algo.geograph.agentfarm.domain.AgentGroup,it.algo.geograph.agentfarm.domain.Root>(role$$root);
    static {
        it.algo.geograph.agentfarm.domain.Root.RootHasAgentGroups = RootHasAgentGroups.getInverseRelation();
    }
    
    static {
        RootHasAgentGroups.setRelationName("it.algo.geograph.agentfarm.domain.AgentGroup.RootHasAgentGroups");
    }
    public static dml.runtime.Relation<it.algo.geograph.agentfarm.domain.AgentGroup,it.algo.geograph.agentfarm.domain.Agent> AgentGroupHasAgents;
    
    
    private RelationList<it.algo.geograph.agentfarm.domain.AgentGroup,it.algo.geograph.agentfarm.domain.Agent> get$rl$agents() {
        return get$$relationList("agents", AgentGroupHasAgents);
        
    }
    
    
    private void initInstance() {
        initInstance(true);
    }
    
    private void initInstance(boolean allocateOnly) {
        
    }
    
    {
        initInstance(false);
    }
    
    protected  AgentGroup_Base() {
        super();
    }
    
    public java.lang.String getName() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "name");
        return ((DO_State)this.get$obj$state(false)).name;
    }
    
    public void setName(java.lang.String name) {
        ((DO_State)this.get$obj$state(true)).name = name;
    }
    
    public java.lang.Integer getDelay() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "delay");
        return ((DO_State)this.get$obj$state(false)).delay;
    }
    
    public void setDelay(java.lang.Integer delay) {
        ((DO_State)this.get$obj$state(true)).delay = delay;
    }
    
    public java.lang.String getAgents_type() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "agents_type");
        return ((DO_State)this.get$obj$state(false)).agents_type;
    }
    
    public void setAgents_type(java.lang.String agents_type) {
        ((DO_State)this.get$obj$state(true)).agents_type = agents_type;
    }
    
    public java.lang.String getStatus() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "status");
        return ((DO_State)this.get$obj$state(false)).status;
    }
    
    public void setStatus(java.lang.String status) {
        ((DO_State)this.get$obj$state(true)).status = status;
    }
    
    public java.util.Date getLast_execution() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "last_execution");
        return ((DO_State)this.get$obj$state(false)).last_execution;
    }
    
    public void setLast_execution(java.util.Date last_execution) {
        ((DO_State)this.get$obj$state(true)).last_execution = last_execution;
    }
    
    public it.algo.geograph.agentfarm.domain.Root getRoot() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "root");
        return ((DO_State)this.get$obj$state(false)).root;
    }
    
    public void setRoot(it.algo.geograph.agentfarm.domain.Root root) {
        RootHasAgentGroups.add((it.algo.geograph.agentfarm.domain.AgentGroup)this, root);
    }
    
    public boolean hasRoot() {
        return (getRoot() != null);
    }
    
    public void removeRoot() {
        setRoot(null);
    }
    
    public int getAgentsCount() {
        return get$rl$agents().size();
    }
    
    public boolean hasAnyAgents() {
        return (! get$rl$agents().isEmpty());
    }
    
    public boolean hasAgents(it.algo.geograph.agentfarm.domain.Agent agents) {
        return get$rl$agents().contains(agents);
    }
    
    public java.util.Set<it.algo.geograph.agentfarm.domain.Agent> getAgentsSet() {
        return get$rl$agents();
    }
    
    public void addAgents(it.algo.geograph.agentfarm.domain.Agent agents) {
        AgentGroupHasAgents.add((it.algo.geograph.agentfarm.domain.AgentGroup)this, agents);
    }
    
    public void removeAgents(it.algo.geograph.agentfarm.domain.Agent agents) {
        AgentGroupHasAgents.remove((it.algo.geograph.agentfarm.domain.AgentGroup)this, agents);
    }
    
    public java.util.List<it.algo.geograph.agentfarm.domain.Agent> getAgents() {
        return get$rl$agents();
    }
    
    public java.util.Iterator<it.algo.geograph.agentfarm.domain.Agent> getAgentsIterator() {
        return get$rl$agents().iterator();
    }
    
    protected boolean checkDisconnected() {
        if (hasRoot()) return false;
        if (hasAnyAgents()) return false;
        return true;
        
    }
    protected dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("agents")) return AgentGroupHasAgents;
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("agents", AgentGroupHasAgents);
        
    }
    protected static class DO_State extends pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String name;
        private java.lang.Integer delay;
        private java.lang.String agents_type;
        private java.lang.String status;
        private java.util.Date last_execution;
        private it.algo.geograph.agentfarm.domain.Root root;
        protected void copyTo(pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.name = this.name;
            newCasted.delay = this.delay;
            newCasted.agents_type = this.agents_type;
            newCasted.status = this.status;
            newCasted.last_execution = this.last_execution;
            newCasted.root = this.root;
            
        }
        
        // serialization code
        protected Object writeReplace() throws java.io.ObjectStreamException {
            return new SerializedForm(this);
        }
        
        protected static class SerializedForm extends pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State.SerializedForm {
            private static final long serialVersionUID = 1L;
            
            private java.lang.String name;
            private java.lang.Integer delay;
            private java.lang.String agents_type;
            private java.lang.String status;
            private Serialized$Date last_execution;
            private it.algo.geograph.agentfarm.domain.Root root;
            
            protected  SerializedForm(DO_State obj) {
                super(obj);
                this.name = obj.name;
                this.delay = obj.delay;
                this.agents_type = obj.agents_type;
                this.status = obj.status;
                this.last_execution = pt.ist.fenixframework.ValueTypeSerializationGenerator.serialize$Date(obj.last_execution);
                this.root = obj.root;
                
            }
            
             Object readResolve() throws java.io.ObjectStreamException {
                DO_State newState = new DO_State();
                fillInState(newState);
                return newState;
            }
            
            protected void fillInState(pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State obj) {
                super.fillInState(obj);
                DO_State state = (DO_State)obj;
                state.name = this.name;
                state.delay = this.delay;
                state.agents_type = this.agents_type;
                state.status = this.status;
                state.last_execution = pt.ist.fenixframework.ValueTypeSerializationGenerator.deSerialize$Date(this.last_execution);
                state.root = this.root;
                
            }
            
        }
        
    }
    
}
