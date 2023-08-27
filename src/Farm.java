public class Farm extends Structure {
    private static final double FARM_RATE = 2;
    
    public Farm(String name, double x, double y) {
        this(name, new Location(x, y));
    }
    
    public Farm(String name, Location location) {
        super(name, location, 50);
    }
    
    @Override
    public void update() {
        this.amount += FARM_RATE;
        System.out.println(getAmountAsString());
    }
}
