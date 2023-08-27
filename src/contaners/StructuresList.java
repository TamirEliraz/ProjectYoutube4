package contaners;

import sim.*;

public class StructuresList extends MyArrayList<Structure> {
//    private HashMap<Type, MyArrayList<? extends Structure>> map;
    
    public Farm getFarm(String name) {
        return (Farm) get(name, Type.FARM);
    }
    
//    @Override
//    protected void init() {
//        map = new HashMap<>() {{
//            for (Type type : Type.values()) {
//                put(type, new MyArrayList<>());
//            }
//        }};
//    }
    
    public TownHall getTownHall(String name) {
        return (TownHall) get(name, Type.TOWN_HALL);
    }
    
    public MyArrayList<Farm> getFarms() {
        return new MyArrayList<>() {{
            for (SimObject obj : StructuresList.this) {
                if (obj.getType().isFarm())
                    add((Farm) obj);
            }
        }};
    }
    
    public MyArrayList<TownHall> getTownHalls() {
        return new MyArrayList<>() {{
            for (SimObject obj : StructuresList.this) {
                if (obj.getType().isTownHall())
                    add((TownHall) obj);
            }
        }};
    }
    
}
