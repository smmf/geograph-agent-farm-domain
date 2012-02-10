package it.algo.geograph.agentfarm.domain;

import pt.ist.fenixframework.pstm.VBox;
import pt.ist.fenixframework.pstm.RelationList;
import pt.ist.fenixframework.ValueTypeSerializationGenerator.*;
public abstract class Root_Base extends pt.ist.fenixframework.pstm.OneBoxDomainObject {
    public static dml.runtime.RoleMany<it.algo.geograph.agentfarm.domain.Root,it.algo.geograph.agentfarm.domain.Agent> role$$agents = new dml.runtime.RoleMany<it.algo.geograph.agentfarm.domain.Root,it.algo.geograph.agentfarm.domain.Agent>() {
        public dml.runtime.RelationBaseSet<it.algo.geograph.agentfarm.domain.Agent> getSet(it.algo.geograph.agentfarm.domain.Root o1) {
            return ((Root_Base)o1).get$rl$agents();
        }
        public dml.runtime.Role<it.algo.geograph.agentfarm.domain.Agent,it.algo.geograph.agentfarm.domain.Root> getInverseRole() {
            return it.algo.geograph.agentfarm.domain.Agent.role$$root;
        }
        
    };
    public static dml.runtime.RoleMany<it.algo.geograph.agentfarm.domain.Root,it.algo.geograph.agentfarm.domain.AgentGroup> role$$agentGroups = new dml.runtime.RoleMany<it.algo.geograph.agentfarm.domain.Root,it.algo.geograph.agentfarm.domain.AgentGroup>() {
        public dml.runtime.RelationBaseSet<it.algo.geograph.agentfarm.domain.AgentGroup> getSet(it.algo.geograph.agentfarm.domain.Root o1) {
            return ((Root_Base)o1).get$rl$agentGroups();
        }
        public dml.runtime.Role<it.algo.geograph.agentfarm.domain.AgentGroup,it.algo.geograph.agentfarm.domain.Root> getInverseRole() {
            return it.algo.geograph.agentfarm.domain.AgentGroup.role$$root;
        }
        
    };
    public static dml.runtime.RoleMany<it.algo.geograph.agentfarm.domain.Root,it.algo.geograph.agentfarm.domain.Route> role$$routes = new dml.runtime.RoleMany<it.algo.geograph.agentfarm.domain.Root,it.algo.geograph.agentfarm.domain.Route>() {
        public dml.runtime.RelationBaseSet<it.algo.geograph.agentfarm.domain.Route> getSet(it.algo.geograph.agentfarm.domain.Root o1) {
            return ((Root_Base)o1).get$rl$routes();
        }
        public dml.runtime.Role<it.algo.geograph.agentfarm.domain.Route,it.algo.geograph.agentfarm.domain.Root> getInverseRole() {
            return it.algo.geograph.agentfarm.domain.Route.role$$root;
        }
        
    };
    public static dml.runtime.Relation<it.algo.geograph.agentfarm.domain.Root,it.algo.geograph.agentfarm.domain.Agent> RootHasAgents;
    public static dml.runtime.Relation<it.algo.geograph.agentfarm.domain.Root,it.algo.geograph.agentfarm.domain.AgentGroup> RootHasAgentGroups;
    public static dml.runtime.Relation<it.algo.geograph.agentfarm.domain.Root,it.algo.geograph.agentfarm.domain.Route> RootHasRoutes;
    
    
    private RelationList<it.algo.geograph.agentfarm.domain.Root,it.algo.geograph.agentfarm.domain.Agent> get$rl$agents() {
        return get$$relationList("agents", RootHasAgents);
        
    }
    private RelationList<it.algo.geograph.agentfarm.domain.Root,it.algo.geograph.agentfarm.domain.AgentGroup> get$rl$agentGroups() {
        return get$$relationList("agentGroups", RootHasAgentGroups);
        
    }
    private RelationList<it.algo.geograph.agentfarm.domain.Root,it.algo.geograph.agentfarm.domain.Route> get$rl$routes() {
        return get$$relationList("routes", RootHasRoutes);
        
    }
    
    
    private void initInstance() {
        initInstance(true);
    }
    
    private void initInstance(boolean allocateOnly) {
        
    }
    
    {
        initInstance(false);
    }
    
    protected  Root_Base() {
        super();
    }
    
    public boolean getLoaded() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "loaded");
        return ((DO_State)this.get$obj$state(false)).loaded;
    }
    
    public void setLoaded(boolean loaded) {
        ((DO_State)this.get$obj$state(true)).loaded = loaded;
    }
    
    public java.lang.Integer getNumAgentGroupIds() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "numAgentGroupIds");
        return ((DO_State)this.get$obj$state(false)).numAgentGroupIds;
    }
    
    public void setNumAgentGroupIds(java.lang.Integer numAgentGroupIds) {
        ((DO_State)this.get$obj$state(true)).numAgentGroupIds = numAgentGroupIds;
    }
    
    public java.lang.Integer getNumAgentIds() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "numAgentIds");
        return ((DO_State)this.get$obj$state(false)).numAgentIds;
    }
    
    public void setNumAgentIds(java.lang.Integer numAgentIds) {
        ((DO_State)this.get$obj$state(true)).numAgentIds = numAgentIds;
    }
    
    public java.lang.Integer getNumRouteIds() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "numRouteIds");
        return ((DO_State)this.get$obj$state(false)).numRouteIds;
    }
    
    public void setNumRouteIds(java.lang.Integer numRouteIds) {
        ((DO_State)this.get$obj$state(true)).numRouteIds = numRouteIds;
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
        RootHasAgents.add((it.algo.geograph.agentfarm.domain.Root)this, agents);
    }
    
    public void removeAgents(it.algo.geograph.agentfarm.domain.Agent agents) {
        RootHasAgents.remove((it.algo.geograph.agentfarm.domain.Root)this, agents);
    }
    
    public java.util.List<it.algo.geograph.agentfarm.domain.Agent> getAgents() {
        return get$rl$agents();
    }
    
    public java.util.Iterator<it.algo.geograph.agentfarm.domain.Agent> getAgentsIterator() {
        return get$rl$agents().iterator();
    }
    
    public int getAgentGroupsCount() {
        return get$rl$agentGroups().size();
    }
    
    public boolean hasAnyAgentGroups() {
        return (! get$rl$agentGroups().isEmpty());
    }
    
    public boolean hasAgentGroups(it.algo.geograph.agentfarm.domain.AgentGroup agentGroups) {
        return get$rl$agentGroups().contains(agentGroups);
    }
    
    public java.util.Set<it.algo.geograph.agentfarm.domain.AgentGroup> getAgentGroupsSet() {
        return get$rl$agentGroups();
    }
    
    public void addAgentGroups(it.algo.geograph.agentfarm.domain.AgentGroup agentGroups) {
        RootHasAgentGroups.add((it.algo.geograph.agentfarm.domain.Root)this, agentGroups);
    }
    
    public void removeAgentGroups(it.algo.geograph.agentfarm.domain.AgentGroup agentGroups) {
        RootHasAgentGroups.remove((it.algo.geograph.agentfarm.domain.Root)this, agentGroups);
    }
    
    public java.util.List<it.algo.geograph.agentfarm.domain.AgentGroup> getAgentGroups() {
        return get$rl$agentGroups();
    }
    
    public java.util.Iterator<it.algo.geograph.agentfarm.domain.AgentGroup> getAgentGroupsIterator() {
        return get$rl$agentGroups().iterator();
    }
    
    public int getRoutesCount() {
        return get$rl$routes().size();
    }
    
    public boolean hasAnyRoutes() {
        return (! get$rl$routes().isEmpty());
    }
    
    public boolean hasRoutes(it.algo.geograph.agentfarm.domain.Route routes) {
        return get$rl$routes().contains(routes);
    }
    
    public java.util.Set<it.algo.geograph.agentfarm.domain.Route> getRoutesSet() {
        return get$rl$routes();
    }
    
    public void addRoutes(it.algo.geograph.agentfarm.domain.Route routes) {
        RootHasRoutes.add((it.algo.geograph.agentfarm.domain.Root)this, routes);
    }
    
    public void removeRoutes(it.algo.geograph.agentfarm.domain.Route routes) {
        RootHasRoutes.remove((it.algo.geograph.agentfarm.domain.Root)this, routes);
    }
    
    public java.util.List<it.algo.geograph.agentfarm.domain.Route> getRoutes() {
        return get$rl$routes();
    }
    
    public java.util.Iterator<it.algo.geograph.agentfarm.domain.Route> getRoutesIterator() {
        return get$rl$routes().iterator();
    }
    
    protected boolean checkDisconnected() {
        if (hasAnyAgents()) return false;
        if (hasAnyAgentGroups()) return false;
        if (hasAnyRoutes()) return false;
        return true;
        
    }
    protected dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("agents")) return RootHasAgents;
        if (attrName.equals("agentGroups")) return RootHasAgentGroups;
        if (attrName.equals("routes")) return RootHasRoutes;
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("agents", RootHasAgents);
        get$$relationList("agentGroups", RootHasAgentGroups);
        get$$relationList("routes", RootHasRoutes);
        
    }
    protected static class DO_State extends pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State {
        private boolean loaded;
        private java.lang.Integer numAgentGroupIds;
        private java.lang.Integer numAgentIds;
        private java.lang.Integer numRouteIds;
        protected void copyTo(pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.loaded = this.loaded;
            newCasted.numAgentGroupIds = this.numAgentGroupIds;
            newCasted.numAgentIds = this.numAgentIds;
            newCasted.numRouteIds = this.numRouteIds;
            
        }
        
        // serialization code
        protected Object writeReplace() throws java.io.ObjectStreamException {
            return new SerializedForm(this);
        }
        
        protected static class SerializedForm extends pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State.SerializedForm {
            private static final long serialVersionUID = 1L;
            
            private boolean loaded;
            private java.lang.Integer numAgentGroupIds;
            private java.lang.Integer numAgentIds;
            private java.lang.Integer numRouteIds;
            
            protected  SerializedForm(DO_State obj) {
                super(obj);
                this.loaded = obj.loaded;
                this.numAgentGroupIds = obj.numAgentGroupIds;
                this.numAgentIds = obj.numAgentIds;
                this.numRouteIds = obj.numRouteIds;
                
            }
            
             Object readResolve() throws java.io.ObjectStreamException {
                DO_State newState = new DO_State();
                fillInState(newState);
                return newState;
            }
            
            protected void fillInState(pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State obj) {
                super.fillInState(obj);
                DO_State state = (DO_State)obj;
                state.loaded = this.loaded;
                state.numAgentGroupIds = this.numAgentGroupIds;
                state.numAgentIds = this.numAgentIds;
                state.numRouteIds = this.numRouteIds;
                
            }
            
        }
        
    }
    
}
