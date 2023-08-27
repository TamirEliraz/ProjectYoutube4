package sim;

import helper.Location;

public class TownHall extends Structure {
    public TownHall(String name, double x, double y) {
        this(name, new Location(x, y));
    }
    
    public TownHall(String name, Location location) {
        super(name, location, 0);
    }
    
    private void tax() {
        amount *= 0.9;
        if (amount < 1) amount = 0;
    }
    
    @Override
    public double withdraw(double requestAmount) {
        tax();
        return super.withdraw(requestAmount);
    }
    
    @Override
    public void deposit(double suppliedAmount) {
        amount += suppliedAmount;
    }
}
