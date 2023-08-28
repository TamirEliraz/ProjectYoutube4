package sim;

public enum Type {
    NONE,
    FARM, TOWN_HALL,
    PEASANT, SOLDIER;
    
    public boolean isFarm() {return this == FARM;}
    
    public boolean isTownHall() {return this == TOWN_HALL;}
    
    public boolean isStructure() {return isFarm() || isTownHall();}
    
    public boolean isPeasant() {return this == PEASANT;}
    
    public boolean isSoldier() {return this == SOLDIER;}
    
    public boolean isAgent() {return isPeasant() || isSoldier();}
    
    public static Type getType(Class cls) {
        return switch (cls.getSimpleName()) {
            case "Farm" -> FARM;
            case "TownHall" -> TOWN_HALL;
            case "Peasant" -> PEASANT;
            case "Soldier" -> SOLDIER;
            default -> NONE;
        };
    }
    
    public Class getTypeClass() {
        return switch (this) {
            case FARM -> Farm.class;
            case TOWN_HALL -> TownHall.class;
            case PEASANT -> Peasant.class;
            /*case SOLDIER -> ;*/
            case SOLDIER, NONE -> null;
        };
    }
}
