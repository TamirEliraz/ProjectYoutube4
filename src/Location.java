import java.util.Objects;

public class Location {
    private double x, y;
    
    public Location(double x, double y) {
        setXY(x, y);
    }
    
    public double getX() {return x;}
    
    public double getY() {return y;}
    
    public void setX(double x) {this.x = x;}
    
    public void setY(double y) {this.y = y;}
    
    public void setXY(double x, double y) {
        setX(x);
        setY(y);
    }
    
    public static String formatPointToString(double p) {
        return String.format("%.02f", p);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Double.compare(x, location.x) == 0 && Double.compare(y, location.y) == 0;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    
    @Override
    public String toString() {
        return "(" + formatPointToString(getX())
                + ", "
                + formatPointToString(getY()) + ")";
    }
}
