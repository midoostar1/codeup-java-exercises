package shapes;

public class ShapesTest {
    public static void main(String[] args) {
     // Measurable myShape = new Rectangle(4,5);
      Measurable  myShape = new Square(6);

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());


    }
}
