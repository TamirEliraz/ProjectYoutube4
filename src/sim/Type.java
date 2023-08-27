package sim;

public enum Type {
    NONE, FARM, TOWN_HALL;
    
    public boolean isFarm() {return this == FARM;}
    
    public boolean isTownHall() {return this == TOWN_HALL;}
    
    public boolean isStructure() {return isFarm() || isTownHall();}
    
    public static Type getType(Class cls) {
        return switch (cls.getName()) {
            case "sim.Farm" -> FARM;
            case "sim.TownHall" -> TOWN_HALL;
            default -> NONE;
        };
    }
    
    public Class getTypeClass() {
        return switch (this) {
            case FARM -> Farm.class;
            case TOWN_HALL -> TownHall.class;
            case NONE -> null;
        };
    }
}
