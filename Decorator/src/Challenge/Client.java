package Challenge;

public class Client {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        RedShapeDecorator redRectangle = new RedShapeDecorator(rectangle);
//        redRectangle.setShape(rectangle);
        redRectangle.draw();

        Circle circle = new Circle();
        circle.draw();

        GreenShapeDecorator greenCircle = new GreenShapeDecorator(circle);
//        greenCircle.setShape(circle);
        greenCircle.draw();
    }
}
