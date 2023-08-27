import contaners.StructuresList;
import sim.Farm;
import sim.TownHall;
import sim.Type;

public class MainTest {
    public static void main(String[] args) {
        StructuresList structures = new StructuresList() {{
            add(new Farm("Farmie", 1, 2));
            add(new TownHall("Farmie", 2, 3));
        }};
        System.out.println(structures);
        structures.getFarm("Farmie").update();
        System.out.println(structures.getTownHall("Farmie").getType());
        
        System.out.println(structures.getFarms().get("Farmie", Type.FARM));
        
        structures.updateAll();
        System.out.println(structures);
        structures.updateAll();
        System.out.println(structures);
    }
}
