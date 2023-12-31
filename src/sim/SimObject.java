package sim;

import helper.Location;

import java.util.Objects;

public abstract class SimObject {
    private final String name;
    private final Type type;
    
    protected SimObject(String name) {
        this.name = name;
        type = Type.getType(getClass());
    }
    
    public Type getType() {return type;}
    
    public String getName() {
        return name;
    }
    
    public abstract Location getLocation();
    
    public abstract void update();
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimObject simObject = (SimObject) o;
        return Objects.equals(name, simObject.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    
    @Override
    public String toString() {
        return "sim.SimObject with a name of " + getName();
    }
}
