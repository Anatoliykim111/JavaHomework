package Day9;

public class Triangle extends Figure{
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3, String color){
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area(){
        return side1 * side2 * 0.5;
    }

    public double perimeter(){
        return side3 + side2 + side1;
    }
}
