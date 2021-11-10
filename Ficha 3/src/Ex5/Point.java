package Ex5;

public class Point<A extends Number, B extends Number> {
    private A x;
    private B y;
    public Point(A x, B y){
        this.x = x;
        this.y = y;
    }

    public void copy(Point<? extends A, ? extends B> p2){
        x = p2.x;
        y = p2.y;
    }

    @Override
    public String toString() {
        return "x: " + x + " y: " + y;
    }
}
