package Challenge;

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("I am rectangle");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("I am circle");
    }
}

abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

//    public void setShape(Shape shape) {
//        this.shape = shape;
//    }

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        if (decoratedShape != null) {
            decoratedShape.draw();
        }
    }

}

class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    public void draw() {
        setRedBorder();
        super.draw();
    }

    public void setRedBorder() {
        System.out.println("Set a red border");
    }
}

class GreenShapeDecorator extends ShapeDecorator {
    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    public void draw() {
        setGreenBorder();
        super.draw();
    }

    public void setGreenBorder() {
        System.out.println("Set a green border");
    }
}