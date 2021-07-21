package Day9;

public class Rectangle extends Figure{
    double length;
    double width;

    public Rectangle(double length, double width, String color){
        super(color);
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;
    }
    public double perimeter(){
        return (length + width) * 2;
    }
}
