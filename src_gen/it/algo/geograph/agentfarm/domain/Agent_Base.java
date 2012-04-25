package it.algo.geograph.agentfarm.domain;

import pt.ist.fenixframework.pstm.VBox;
import pt.ist.fenixframework.pstm.RelationList;
import pt.ist.fenixframework.ValueTypeSerializationGenerator.*;
public abstract class Agent_Base extends pt.ist.fenixframework.pstm.OneBoxDomainObject {
    public static pt.ist.fenixframework.pstm.dml.RoleOne<it.algo.geograph.agentfarm.domain.Agent,it.algo.geograph.agentfarm.domain.Root> role$$root = new pt.ist.fenixframework.pstm.dml.RoleOne<it.algo.geograph.agentfarm.domain.Agent,it.algo.geograph.agentfarm.domain.Root>() {
        public it.algo.geograph.agentfarm.domain.Root getValue(it.algo.geograph.agentfarm.domain.Agent o1) {
            return ((Agent_Base.DO_State)o1.get$obj$state(false)).root;
        }
        public void setValue(it.algo.geograph.agentfarm.domain.Agent o1, it.algo.geograph.agentfarm.domain.Root o2) {
            ((Agent_Base.DO_State)o1.get$obj$state(true)).root = o2;
        }
        public dml.runtime.Role<it.algo.geograph.agentfarm.domain.Root,it.algo.geograph.agentfarm.domain.Agent> getInverseRole() {
            return it.algo.geograph.agentfarm.domain.Root.role$$agents;
        }
        
    };
    public static pt.ist.fenixframework.pstm.dml.RoleOne<it.algo.geograph.agentfarm.domain.Agent,it.algo.geograph.agentfarm.domain.Position> role$$position = new pt.ist.fenixframework.pstm.dml.RoleOne<it.algo.geograph.agentfarm.domain.Agent,it.algo.geograph.agentfarm.domain.Position>() {
        public it.algo.geograph.agentfarm.domain.Position getValue(it.algo.geograph.agentfarm.domain.Agent o1) {
            return ((Agent_Base.DO_State)o1.get$obj$state(false)).position;
        }
        public void setValue(it.algo.geograph.agentfarm.domain.Agent o1, it.algo.geograph.agentfarm.domain.Position o2) {
            ((Agent_Base.DO_State)o1.get$obj$state(true)).position = o2;
        }
        public dml.runtime.Role<it.algo.geograph.agentfarm.domain.Position,it.algo.geograph.agentfarm.domain.Agent> getInverseRole() {
            return it.algo.geograph.agentfarm.domain.Position.role$$agent;
        }
        
    };
    public static pt.ist.fenixframework.pstm.dml.RoleOne<it.algo.geograph.agentfarm.domain.Agent,it.algo.geograph.agentfarm.domain.AgentGroup> role$$agentGroup = new pt.ist.fenixframework.pstm.dml.RoleOne<it.algo.geograph.agentfarm.domain.Agent,it.algo.geograph.agentfarm.domain.AgentGroup>() {
        public it.algo.geograph.agentfarm.domain.AgentGroup getValue(it.algo.geograph.agentfarm.domain.Agent o1) {
            return ((Agent_Base.DO_State)o1.get$obj$state(false)).agentGroup;
        }
        public void setValue(it.algo.geograph.agentfarm.domain.Agent o1, it.algo.geograph.agentfarm.domain.AgentGroup o2) {
            ((Agent_Base.DO_State)o1.get$obj$state(true)).agentGroup = o2;
        }
        public dml.runtime.Role<it.algo.geograph.agentfarm.domain.AgentGroup,it.algo.geograph.agentfarm.domain.Agent> getInverseRole() {
            return it.algo.geograph.agentfarm.domain.AgentGroup.role$$agents;
        }
        
    };
    public static pt.ist.fenixframework.pstm.LoggingRelation<it.algo.geograph.agentfarm.domain.Agent,it.algo.geograph.agentfarm.domain.Root> RootHasAgents = new pt.ist.fenixframework.pstm.LoggingRelation<it.algo.geograph.agentfarm.domain.Agent,it.algo.geograph.agentfarm.domain.Root>(role$$root);
    static {
        it.algo.geograph.agentfarm.domain.Root.RootHasAgents = RootHasAgents.getInverseRelation();
    }
    
    static {
        RootHasAgents.setRelationName("it.algo.geograph.agentfarm.domain.Agent.RootHasAgents");
    }
    public static dml.runtime.Relation<it.algo.geograph.agentfarm.domain.Agent,it.algo.geograph.agentfarm.domain.Position> AgentHasPosition;
    public static pt.ist.fenixframework.pstm.LoggingRelation<it.algo.geograph.agentfarm.domain.Agent,it.algo.geograph.agentfarm.domain.AgentGroup> AgentGroupHasAgents = new pt.ist.fenixframework.pstm.LoggingRelation<it.algo.geograph.agentfarm.domain.Agent,it.algo.geograph.agentfarm.domain.AgentGroup>(role$$agentGroup);
    static {
        it.algo.geograph.agentfarm.domain.AgentGroup.AgentGroupHasAgents = AgentGroupHasAgents.getInverseRelation();
    }
    
    static {
        AgentGroupHasAgents.setRelationName("it.algo.geograph.agentfarm.domain.Agent.AgentGroupHasAgents");
    }
    
    
    
    
    private void initInstance() {
        initInstance(true);
    }
    
    private void initInstance(boolean allocateOnly) {
        
    }
    
    {
        initInstance(false);
    }
    
    protected  Agent_Base() {
        super();
    }
    
    public java.lang.String getStatus() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "status");
        return ((DO_State)this.get$obj$state(false)).status;
    }
    
    public void setStatus(java.lang.String status) {
        ((DO_State)this.get$obj$state(true)).status = status;
    }
    
    public java.lang.String getGeo_object() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "geo_object");
        return ((DO_State)this.get$obj$state(false)).geo_object;
    }
    
    public void setGeo_object(java.lang.String geo_object) {
        ((DO_State)this.get$obj$state(true)).geo_object = geo_object;
    }
    
    public java.lang.String getPerception_status() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "perception_status");
        return ((DO_State)this.get$obj$state(false)).perception_status;
    }
    
    public void setPerception_status(java.lang.String perception_status) {
        ((DO_State)this.get$obj$state(true)).perception_status = perception_status;
    }
    
    public java.math.BigDecimal getLatitude() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "latitude");
        return ((DO_State)this.get$obj$state(false)).latitude;
    }
    
    public void setLatitude(java.math.BigDecimal latitude) {
        ((DO_State)this.get$obj$state(true)).latitude = latitude;
    }
    
    public java.math.BigDecimal getLongitude() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "longitude");
        return ((DO_State)this.get$obj$state(false)).longitude;
    }
    
    public void setLongitude(java.math.BigDecimal longitude) {
        ((DO_State)this.get$obj$state(true)).longitude = longitude;
    }
    
    public java.lang.String getType() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "type");
        return ((DO_State)this.get$obj$state(false)).type;
    }
    
    public void setType(java.lang.String type) {
        ((DO_State)this.get$obj$state(true)).type = type;
    }
    
    public it.algo.geograph.agentfarm.domain.Root getRoot() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "root");
        return ((DO_State)this.get$obj$state(false)).root;
    }
    
    public void setRoot(it.algo.geograph.agentfarm.domain.Root root) {
        RootHasAgents.add((it.algo.geograph.agentfarm.domain.Agent)this, root);
    }
    
    public boolean hasRoot() {
        return (getRoot() != null);
    }
    
    public void removeRoot() {
        setRoot(null);
    }
    
    public it.algo.geograph.agentfarm.domain.Position getPosition() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "position");
        return ((DO_State)this.get$obj$state(false)).position;
    }
    
    public void setPosition(it.algo.geograph.agentfarm.domain.Position position) {
        AgentHasPosition.add((it.algo.geograph.agentfarm.domain.Agent)this, position);
    }
    
    public boolean hasPosition() {
        return (getPosition() != null);
    }
    
    public void removePosition() {
        setPosition(null);
    }
    
    public it.algo.geograph.agentfarm.domain.AgentGroup getAgentGroup() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "agentGroup");
        return ((DO_State)this.get$obj$state(false)).agentGroup;
    }
    
    public void setAgentGroup(it.algo.geograph.agentfarm.domain.AgentGroup agentGroup) {
        AgentGroupHasAgents.add((it.algo.geograph.agentfarm.domain.Agent)this, agentGroup);
    }
    
    public boolean hasAgentGroup() {
        return (getAgentGroup() != null);
    }
    
    public void removeAgentGroup() {
        setAgentGroup(null);
    }
    
    protected boolean checkDisconnected() {
        if (hasRoot()) return false;
        if (hasPosition()) return false;
        if (hasAgentGroup()) return false;
        return true;
        
    }
    protected dml.runtime.Relation get$$relationFor(String attrName) {
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        
    }
    protected static class DO_State extends pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String status;
        private java.lang.String geo_object;
        private java.lang.String perception_status;
        private java.math.BigDecimal latitude;
        private java.math.BigDecimal longitude;
        private java.lang.String type;
        private it.algo.geograph.agentfarm.domain.Root root;
        private it.algo.geograph.agentfarm.domain.Position position;
        private it.algo.geograph.agentfarm.domain.AgentGroup agentGroup;
        protected void copyTo(pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.status = this.status;
            newCasted.geo_object = this.geo_object;
            newCasted.perception_status = this.perception_status;
            newCasted.latitude = this.latitude;
            newCasted.longitude = this.longitude;
            newCasted.type = this.type;
            newCasted.root = this.root;
            newCasted.position = this.position;
            newCasted.agentGroup = this.agentGroup;
            
        }
        
        // serialization code
        protected Object writeReplace() throws java.io.ObjectStreamException {
            return new SerializedForm(this);
        }
        
        protected static class SerializedForm extends pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State.SerializedForm {
            private static final long serialVersionUID = 1L;
            
            private java.lang.String status;
            private java.lang.String geo_object;
            private java.lang.String perception_status;
            private Serialized$Decimal latitude;
            private Serialized$Decimal longitude;
            private java.lang.String type;
            private it.algo.geograph.agentfarm.domain.Root root;
            private it.algo.geograph.agentfarm.domain.Position position;
            private it.algo.geograph.agentfarm.domain.AgentGroup agentGroup;
            
            protected  SerializedForm(DO_State obj) {
                super(obj);
                this.status = obj.status;
                this.geo_object = obj.geo_object;
                this.perception_status = obj.perception_status;
                this.latitude = pt.ist.fenixframework.ValueTypeSerializationGenerator.serialize$Decimal(obj.latitude);
                this.longitude = pt.ist.fenixframework.ValueTypeSerializationGenerator.serialize$Decimal(obj.longitude);
                this.type = obj.type;
                this.root = obj.root;
                this.position = obj.position;
                this.agentGroup = obj.agentGroup;
                
            }
            
             Object readResolve() throws java.io.ObjectStreamException {
                DO_State newState = new DO_State();
                fillInState(newState);
                return newState;
            }
            
            protected void fillInState(pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State obj) {
                super.fillInState(obj);
                DO_State state = (DO_State)obj;
                state.status = this.status;
                state.geo_object = this.geo_object;
                state.perception_status = this.perception_status;
                state.latitude = pt.ist.fenixframework.ValueTypeSerializationGenerator.deSerialize$Decimal(this.latitude);
                state.longitude = pt.ist.fenixframework.ValueTypeSerializationGenerator.deSerialize$Decimal(this.longitude);
                state.type = this.type;
                state.root = this.root;
                state.position = this.position;
                state.agentGroup = this.agentGroup;
                
            }
            
        }
        
    }
    
}
