package Challenge2;

abstract class Shape {
    protected IColor color;

    protected Shape(IColor color) {
        this.color = color;
    }
    abstract void drawShapes(int border);

    abstract void modifyBorder(int border, int increment);
}

class Triangle extends Shape {

    public Triangle(IColor color) {
        super(color);
    }

    @Override
    void drawShapes(int border) {
        System.out.println("This triangle is colored with");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("We are changing the border length " + increment + " times");
        border = border * increment;
        drawShapes(border);
    }
}

class Rectangle extends Shape {

    public Rectangle(IColor color) {
        super(color);
    }

    @Override
    void drawShapes(int border) {
        System.out.println("This rectangle is colored with");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("We are changing the border length " + increment + " times");
        border = border * increment;
        drawShapes(border);
    }
}
