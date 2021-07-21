package Day9;

public class Circle extends Figure{
    double radius;

    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }

    public double area(){
        return radius * radius * Math.PI;
    }

    public double perimeter(){
        return 2*radius*Math.PI;
    }
}
