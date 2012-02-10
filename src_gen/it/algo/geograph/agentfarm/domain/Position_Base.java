package it.algo.geograph.agentfarm.domain;

import pt.ist.fenixframework.pstm.VBox;
import pt.ist.fenixframework.pstm.RelationList;
import pt.ist.fenixframework.ValueTypeSerializationGenerator.*;
public abstract class Position_Base extends pt.ist.fenixframework.pstm.OneBoxDomainObject {
    public static pt.ist.fenixframework.pstm.dml.RoleOne<it.algo.geograph.agentfarm.domain.Position,it.algo.geograph.agentfarm.domain.Agent> role$$agent = new pt.ist.fenixframework.pstm.dml.RoleOne<it.algo.geograph.agentfarm.domain.Position,it.algo.geograph.agentfarm.domain.Agent>() {
        public it.algo.geograph.agentfarm.domain.Agent getValue(it.algo.geograph.agentfarm.domain.Position o1) {
            return ((Position_Base.DO_State)o1.get$obj$state(false)).agent;
        }
        public void setValue(it.algo.geograph.agentfarm.domain.Position o1, it.algo.geograph.agentfarm.domain.Agent o2) {
            ((Position_Base.DO_State)o1.get$obj$state(true)).agent = o2;
        }
        public dml.runtime.Role<it.algo.geograph.agentfarm.domain.Agent,it.algo.geograph.agentfarm.domain.Position> getInverseRole() {
            return it.algo.geograph.agentfarm.domain.Agent.role$$position;
        }
        
    };
    public static pt.ist.fenixframework.pstm.dml.RoleOne<it.algo.geograph.agentfarm.domain.Position,it.algo.geograph.agentfarm.domain.Route> role$$route = new pt.ist.fenixframework.pstm.dml.RoleOne<it.algo.geograph.agentfarm.domain.Position,it.algo.geograph.agentfarm.domain.Route>() {
        public it.algo.geograph.agentfarm.domain.Route getValue(it.algo.geograph.agentfarm.domain.Position o1) {
            return ((Position_Base.DO_State)o1.get$obj$state(false)).route;
        }
        public void setValue(it.algo.geograph.agentfarm.domain.Position o1, it.algo.geograph.agentfarm.domain.Route o2) {
            ((Position_Base.DO_State)o1.get$obj$state(true)).route = o2;
        }
        public dml.runtime.Role<it.algo.geograph.agentfarm.domain.Route,it.algo.geograph.agentfarm.domain.Position> getInverseRole() {
            return it.algo.geograph.agentfarm.domain.Route.role$$positions;
        }
        
    };
    public static pt.ist.fenixframework.pstm.LoggingRelation<it.algo.geograph.agentfarm.domain.Position,it.algo.geograph.agentfarm.domain.Agent> AgentHasPosition = new pt.ist.fenixframework.pstm.LoggingRelation<it.algo.geograph.agentfarm.domain.Position,it.algo.geograph.agentfarm.domain.Agent>(role$$agent);
    static {
        it.algo.geograph.agentfarm.domain.Agent.AgentHasPosition = AgentHasPosition.getInverseRelation();
    }
    
    static {
        AgentHasPosition.setRelationName("it.algo.geograph.agentfarm.domain.Position.AgentHasPosition");
    }
    public static pt.ist.fenixframework.pstm.LoggingRelation<it.algo.geograph.agentfarm.domain.Position,it.algo.geograph.agentfarm.domain.Route> RouteHasPositions = new pt.ist.fenixframework.pstm.LoggingRelation<it.algo.geograph.agentfarm.domain.Position,it.algo.geograph.agentfarm.domain.Route>(role$$route);
    static {
        it.algo.geograph.agentfarm.domain.Route.RouteHasPositions = RouteHasPositions.getInverseRelation();
    }
    
    static {
        RouteHasPositions.setRelationName("it.algo.geograph.agentfarm.domain.Position.RouteHasPositions");
    }
    
    
    
    
    private void initInstance() {
        initInstance(true);
    }
    
    private void initInstance(boolean allocateOnly) {
        
    }
    
    {
        initInstance(false);
    }
    
    protected  Position_Base() {
        super();
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
    
    public java.lang.Integer getProgressive() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "progressive");
        return ((DO_State)this.get$obj$state(false)).progressive;
    }
    
    public void setProgressive(java.lang.Integer progressive) {
        ((DO_State)this.get$obj$state(true)).progressive = progressive;
    }
    
    public it.algo.geograph.agentfarm.domain.Agent getAgent() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "agent");
        return ((DO_State)this.get$obj$state(false)).agent;
    }
    
    public void setAgent(it.algo.geograph.agentfarm.domain.Agent agent) {
        AgentHasPosition.add((it.algo.geograph.agentfarm.domain.Position)this, agent);
    }
    
    public boolean hasAgent() {
        return (getAgent() != null);
    }
    
    public void removeAgent() {
        setAgent(null);
    }
    
    public it.algo.geograph.agentfarm.domain.Route getRoute() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "route");
        return ((DO_State)this.get$obj$state(false)).route;
    }
    
    public void setRoute(it.algo.geograph.agentfarm.domain.Route route) {
        RouteHasPositions.add((it.algo.geograph.agentfarm.domain.Position)this, route);
    }
    
    public boolean hasRoute() {
        return (getRoute() != null);
    }
    
    public void removeRoute() {
        setRoute(null);
    }
    
    protected boolean checkDisconnected() {
        if (hasAgent()) return false;
        if (hasRoute()) return false;
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
        private java.math.BigDecimal latitude;
        private java.math.BigDecimal longitude;
        private java.lang.Integer progressive;
        private it.algo.geograph.agentfarm.domain.Agent agent;
        private it.algo.geograph.agentfarm.domain.Route route;
        protected void copyTo(pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.latitude = this.latitude;
            newCasted.longitude = this.longitude;
            newCasted.progressive = this.progressive;
            newCasted.agent = this.agent;
            newCasted.route = this.route;
            
        }
        
        // serialization code
        protected Object writeReplace() throws java.io.ObjectStreamException {
            return new SerializedForm(this);
        }
        
        protected static class SerializedForm extends pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State.SerializedForm {
            private static final long serialVersionUID = 1L;
            
            private Serialized$Decimal latitude;
            private Serialized$Decimal longitude;
            private java.lang.Integer progressive;
            private it.algo.geograph.agentfarm.domain.Agent agent;
            private it.algo.geograph.agentfarm.domain.Route route;
            
            protected  SerializedForm(DO_State obj) {
                super(obj);
                this.latitude = pt.ist.fenixframework.ValueTypeSerializationGenerator.serialize$Decimal(obj.latitude);
                this.longitude = pt.ist.fenixframework.ValueTypeSerializationGenerator.serialize$Decimal(obj.longitude);
                this.progressive = obj.progressive;
                this.agent = obj.agent;
                this.route = obj.route;
                
            }
            
             Object readResolve() throws java.io.ObjectStreamException {
                DO_State newState = new DO_State();
                fillInState(newState);
                return newState;
            }
            
            protected void fillInState(pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State obj) {
                super.fillInState(obj);
                DO_State state = (DO_State)obj;
                state.latitude = pt.ist.fenixframework.ValueTypeSerializationGenerator.deSerialize$Decimal(this.latitude);
                state.longitude = pt.ist.fenixframework.ValueTypeSerializationGenerator.deSerialize$Decimal(this.longitude);
                state.progressive = this.progressive;
                state.agent = this.agent;
                state.route = this.route;
                
            }
            
        }
        
    }
    
}
