package shapes;
import util.Input;
public class CircleApp {


    public static void main(String[] args) {
        System.out.println("Enter a radius:");
        double userRadius = Input.getDouble();
        Circle circle = new Circle(userRadius);
        double area = circle.getArea();
        double circumference = circle.getCircumrence();
        System.out.printf("Your circle has a circumference of: %s, and an area of: %s", circumference, area);
    }
}
