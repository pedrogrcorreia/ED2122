package Ex3;

public abstract class Figure implements Comparable<Figure> {
    public abstract double area();

    @Override
    public int compareTo(Figure o) {
        if(this.area() > o.area()){
            return 1;
        }
        else if(this.area() < o.area()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
