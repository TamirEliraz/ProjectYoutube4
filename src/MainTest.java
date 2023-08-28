import contaners.StructuresList;
import helper.Location;
import helper.Point;
import sim.Farm;
import sim.TownHall;
import sim.Type;

public class MainTest {
    public static void main(String[] args) {
        Location location1 = new Location(0, 3);
        Location location2 = new Location(4, 0);
        System.out.println(location1);
        System.out.println(location2);
        double distance = location1.getDistance(location2);
        System.out.println("The distance between " + location1 +
                " and " + location2 + " is " + distance);
    }
}
