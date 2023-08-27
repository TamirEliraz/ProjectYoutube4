public class Farm extends Structure {
    private static final double FARM_RATE = 2;
    
    public Farm(String name, double x, double y) {
        this(name, new Location(x, y));
    }
    
    public Farm(String name, Location location) {
        super(name, location, 50);
    }
    private String getAmountAsString(){
        return "The current amount is " + Location.formatPointToString(amount);
    }
    
    @Override
    public void update() {
        this.amount += FARM_RATE;
        System.out.println(getAmountAsString());
    }
    
    @Override
    public double withdraw(double requestAmount) {
        double val = Math.min(requestAmount, amount);
        amount = Math.max(0, amount - requestAmount);
        return val;
    }
    
    @Override
    public String toString() {
        return "Farm " + super.toString() + ", " + getAmountAsString();
    }
}
