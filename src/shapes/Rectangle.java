package shapes;

public class Rectangle {
    protected double length;
    protected double width;
    public  Rectangle(double width, double length){
       this.length = length;
      this.width = width;
    }
    public double getArea(){
       return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
}
