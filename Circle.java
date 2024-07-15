public class Circle extends Shape{
private double radius;
    private int Perimeter;

    public Circle(){
    super();
    this.radius=1.0;
}

public Circle(String color, boolean filled){
    super(color, filled);
    this.radius=1.0;
}


public Circle( String color, boolean filled, double radius){
    super(color,filled);
    this.radius=radius;


}
public double getRadius(){
    return radius;
}
public void setRadius(double radius){
    this.radius=radius;
}
public double getArea(){
    double Area = 0;
    return Math.PI*radius*radius;
}
public double getPerimeter(){
    return 2*Math.PI*radius*Perimeter;
}

    @Override
public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}

