package Challenge2;

public class Client {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new GreenColor());
        triangle.drawShapes(20);
        triangle.modifyBorder(20, 3);

        Rectangle rectangle = new Rectangle(new RedColor());
        rectangle.drawShapes(50);
        rectangle.modifyBorder(50, 2);
    }
}
