import java.util.Objects;

public abstract class Structure extends SimObject {
    private final Location location;
    protected double amount;
    
    protected Structure(String name, Location location, double amount) {
        super(name);
        this.location = location;
        this.amount = amount;
    }
    
    protected Structure(String name, double x, double y, double amount) {
        this(name, new Location(x, y), amount);
    }
    
    @Override
    public Location getLocation() {
        return location;
    }
    
    @Override
    public void update() {}
    
    public void deposit() {}
    
    public double withdraw(double requestAmount) {return 0;}
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Structure structure = (Structure) o;
        return Double.compare(amount, structure.amount) == 0 && Objects.equals(location, structure.location);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), location, amount);
    }
    
    @Override
    public String toString() {
        return getName() + " at " + getLocation();
    }
}
