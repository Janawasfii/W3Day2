//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();
        System.out.println(shape.toString());
        System.out.println("*********************************************");


        Circle circle = new Circle("blue", true, 9.0);
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("*********************************************");

        Rectangle rectangle = new Rectangle("yellow", false, 5.0, 7.0);
        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("*********************************************");


        Square square = new Square("purple",true, 8.0);
        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("*********************************************");





    }
}