package AbstractCreator;

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw rectangle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw square");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw circle");
    }
}