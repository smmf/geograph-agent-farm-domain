package it.algo.geograph.agentfarm.domain;

import pt.ist.fenixframework.pstm.VBox;
import pt.ist.fenixframework.pstm.RelationList;
import pt.ist.fenixframework.ValueTypeSerializationGenerator.*;
public abstract class Route_Base extends pt.ist.fenixframework.pstm.OneBoxDomainObject {
    public static dml.runtime.RoleMany<it.algo.geograph.agentfarm.domain.Route,it.algo.geograph.agentfarm.domain.Position> role$$positions = new dml.runtime.RoleMany<it.algo.geograph.agentfarm.domain.Route,it.algo.geograph.agentfarm.domain.Position>() {
        public dml.runtime.RelationBaseSet<it.algo.geograph.agentfarm.domain.Position> getSet(it.algo.geograph.agentfarm.domain.Route o1) {
            return ((Route_Base)o1).get$rl$positions();
        }
        public dml.runtime.Role<it.algo.geograph.agentfarm.domain.Position,it.algo.geograph.agentfarm.domain.Route> getInverseRole() {
            return it.algo.geograph.agentfarm.domain.Position.role$$route;
        }
        
    };
    public static pt.ist.fenixframework.pstm.dml.RoleOne<it.algo.geograph.agentfarm.domain.Route,it.algo.geograph.agentfarm.domain.Root> role$$root = new pt.ist.fenixframework.pstm.dml.RoleOne<it.algo.geograph.agentfarm.domain.Route,it.algo.geograph.agentfarm.domain.Root>() {
        public it.algo.geograph.agentfarm.domain.Root getValue(it.algo.geograph.agentfarm.domain.Route o1) {
            return ((Route_Base.DO_State)o1.get$obj$state(false)).root;
        }
        public void setValue(it.algo.geograph.agentfarm.domain.Route o1, it.algo.geograph.agentfarm.domain.Root o2) {
            ((Route_Base.DO_State)o1.get$obj$state(true)).root = o2;
        }
        public dml.runtime.Role<it.algo.geograph.agentfarm.domain.Root,it.algo.geograph.agentfarm.domain.Route> getInverseRole() {
            return it.algo.geograph.agentfarm.domain.Root.role$$routes;
        }
        
    };
    public static dml.runtime.Relation<it.algo.geograph.agentfarm.domain.Route,it.algo.geograph.agentfarm.domain.Position> RouteHasPositions;
    public static pt.ist.fenixframework.pstm.LoggingRelation<it.algo.geograph.agentfarm.domain.Route,it.algo.geograph.agentfarm.domain.Root> RootHasRoutes = new pt.ist.fenixframework.pstm.LoggingRelation<it.algo.geograph.agentfarm.domain.Route,it.algo.geograph.agentfarm.domain.Root>(role$$root);
    static {
        it.algo.geograph.agentfarm.domain.Root.RootHasRoutes = RootHasRoutes.getInverseRelation();
    }
    
    static {
        RootHasRoutes.setRelationName("it.algo.geograph.agentfarm.domain.Route.RootHasRoutes");
    }
    
    
    private RelationList<it.algo.geograph.agentfarm.domain.Route,it.algo.geograph.agentfarm.domain.Position> get$rl$positions() {
        return get$$relationList("positions", RouteHasPositions);
        
    }
    
    
    private void initInstance() {
        initInstance(true);
    }
    
    private void initInstance(boolean allocateOnly) {
        
    }
    
    {
        initInstance(false);
    }
    
    protected  Route_Base() {
        super();
    }
    
    public java.lang.String getName() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "name");
        return ((DO_State)this.get$obj$state(false)).name;
    }
    
    public void setName(java.lang.String name) {
        ((DO_State)this.get$obj$state(true)).name = name;
    }
    
    public int getPositionsCount() {
        return get$rl$positions().size();
    }
    
    public boolean hasAnyPositions() {
        return (! get$rl$positions().isEmpty());
    }
    
    public boolean hasPositions(it.algo.geograph.agentfarm.domain.Position positions) {
        return get$rl$positions().contains(positions);
    }
    
    public java.util.Set<it.algo.geograph.agentfarm.domain.Position> getPositionsSet() {
        return get$rl$positions();
    }
    
    public void addPositions(it.algo.geograph.agentfarm.domain.Position positions) {
        RouteHasPositions.add((it.algo.geograph.agentfarm.domain.Route)this, positions);
    }
    
    public void removePositions(it.algo.geograph.agentfarm.domain.Position positions) {
        RouteHasPositions.remove((it.algo.geograph.agentfarm.domain.Route)this, positions);
    }
    
    public java.util.List<it.algo.geograph.agentfarm.domain.Position> getPositions() {
        return get$rl$positions();
    }
    
    public java.util.Iterator<it.algo.geograph.agentfarm.domain.Position> getPositionsIterator() {
        return get$rl$positions().iterator();
    }
    
    public it.algo.geograph.agentfarm.domain.Root getRoot() {
        pt.ist.fenixframework.pstm.DataAccessPatterns.noteGetAccess(this, "root");
        return ((DO_State)this.get$obj$state(false)).root;
    }
    
    public void setRoot(it.algo.geograph.agentfarm.domain.Root root) {
        RootHasRoutes.add((it.algo.geograph.agentfarm.domain.Route)this, root);
    }
    
    public boolean hasRoot() {
        return (getRoot() != null);
    }
    
    public void removeRoot() {
        setRoot(null);
    }
    
    protected boolean checkDisconnected() {
        if (hasAnyPositions()) return false;
        if (hasRoot()) return false;
        return true;
        
    }
    protected dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("positions")) return RouteHasPositions;
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("positions", RouteHasPositions);
        
    }
    protected static class DO_State extends pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String name;
        private it.algo.geograph.agentfarm.domain.Root root;
        protected void copyTo(pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.name = this.name;
            newCasted.root = this.root;
            
        }
        
        // serialization code
        protected Object writeReplace() throws java.io.ObjectStreamException {
            return new SerializedForm(this);
        }
        
        protected static class SerializedForm extends pt.ist.fenixframework.pstm.OneBoxDomainObject.DO_State.SerializedForm {
            private static final long serialVersionUID = 1L;
            
            private java.lang.String name;
            private it.algo.geograph.agentfarm.domain.Root root;
            
            protected  SerializedForm(DO_State obj) {
                super(obj);
                this.name = obj.name;
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
                state.root = this.root;
                
            }
            
        }
        
    }
    
}
