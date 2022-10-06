package shapes;

public class Square extends Rectangle {


    public Square(double side) {
        super(side,side);

    }

    public double getArea() {return length*4;}

    public double getPerimeter() {return Math.pow(length, 2);}

}
