package helper;

import java.util.Objects;

public class Point<X, Y> {
    private X x;
    private Y y;
    
    protected Point(X x, Y y) {
        setXY(x, y);
    }
    
    public X getX() {return x;}
    
    public Y getY() {return y;}
    
    public void setX(X x) {this.x = x;}
    
    public void setY(Y y) {this.y = y;}
    
    public void setXY(X x, Y y) {
        setX(x);
        setY(y);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point<?, ?> point = (Point<?, ?>) o;
        return Objects.equals(x, point.x) && Objects.equals(y, point.y);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    
    @Override
    public String toString() {
        return "(" + getX()
                + ", "
                + getY() + ")";
    }
}
