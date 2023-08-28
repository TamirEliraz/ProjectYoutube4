package helper;

import java.util.Objects;

public class Location extends Point<Double, Double> {
    public Location(double x, double y) {
        super(x, y);
    }
    
    public static String formatPointToString(double p) {
        return String.format("%.02f", p);
    }
    
    private double pow(double a, int x) {
        return x <= 0 ? 1 : a * pow(a, x - 1);
    }
    
    public double getDistance(Location location) {
        double a = pow(getX() - location.getX(), 2);
        double b = pow(getY() - location.getY(), 2);
        return Math.sqrt(
                 a+b
        );
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Double.compare(getX(), location.getX()) == 0 &&
                Double.compare(getY(), location.getY()) == 0;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
    
    @Override
    public String toString() {
        return "(" + formatPointToString(getX())
                + ", "
                + formatPointToString(getY()) + ")";
    }
}
