package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side,side);

    }

    @Override
  protected void setLength(double side) {
      this.length = side;
    }

    @Override
  protected  void setWidth(double side) {
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return 4* length;
    }

    @Override
    public double getArea() {
        return Math.pow(length,2);
    }
}
