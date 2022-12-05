package InterfaceSegregationPrinciple;

public interface ShapeInterface {
    public double area();
}

interface SolidShapeInterface {
    public double volume();
}

interface ManageShapeInterface {
    public double calculate();
}

class Cube implements ShapeInterface, SolidShapeInterface, ManageShapeInterface {
    public double area() {
        return 1.0;
    }

    public double volume() {
        return 1.0;
    }

    public double calculate() {
        return this.area() + this.volume();
    }
}

class Square implements ShapeInterface, ManageShapeInterface {
    public double area() {
        return 2.0;
    }

    public double calculate() {
        return this.area();
    }
}