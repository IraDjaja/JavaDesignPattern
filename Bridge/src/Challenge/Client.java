package Challenge;

public class Client {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new GreenColor());
        triangle.drawShape(20);
        triangle.modifyBorder(20, 3);

        Shape rectangle = new Rectangle(new RedColor());
        rectangle.drawShape(50);
        rectangle.modifyBorder(50, 2);
    }
}
