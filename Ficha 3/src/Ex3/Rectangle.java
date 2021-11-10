package Ex3;

public class Rectangle extends Figure{
    double width, height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width*height;
    }
}
