package sim;

import helper.Location;

public abstract class Agent extends SimObject {
    private double health;
    private final States states;
    
    protected Agent(String name) {
        super(name);
        states = new States();
    }
    
    private void moveTo() {
        
        states.startMoving();
    }
    
    public void moveTo(Location location) {
        moveTo(); // default
    }
    
    public void moveTo(double x, double y) {
        moveTo(new Location(x, y));
    }
    
    public void moveTo(SimObject simObject) {
        if (simObject != null) moveTo(simObject.getLocation());
    }
    
    public abstract void getHit();
    
    public void startWorking() {}
    
    public void startAttacking() {}
}
