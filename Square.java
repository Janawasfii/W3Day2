public class Square extends Rectangle{

public Square() {
        super(1.0,1.0); }

public Square(double side) {
        super(side, side); }

public Square(String color,boolean filled,double side) {
        super(color,filled,side,side);

}

    @Override
public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);}

public void setLength(double side) {
       super.setWidth(side);
       super.setLength(side);}

public String toString() {
        return "A Square with side=" + getWidth()  + super.toString();
    }







}

