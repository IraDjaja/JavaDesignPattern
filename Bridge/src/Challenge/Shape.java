package Challenge;

abstract class Shape {
    protected IColor color;

    protected Shape(IColor color) {
        this.color = color;
    }

    abstract void drawShape(int border);

    abstract void modifyBorder(int border, int increment);
}

class Triangle extends Shape {

    protected Triangle(IColor color) {
        super(color);
    }

    @Override
    void drawShape(int border) {
        System.out.println("This triangle is colored with ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
       System.out.println("Now we are changing the border length " + increment + " times");
       border = border * increment;
       drawShape(border);
    }
}

class Rectangle extends Shape {
    protected Rectangle(IColor color) {
        super(color);
    }

    @Override
    void drawShape(int border) {
        System.out.println("This rectangle is colored with ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("Now we are changing the border length" + increment + " times");
        border = border * increment;
        drawShape(border);
    }
}