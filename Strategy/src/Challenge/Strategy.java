package Challenge;

public interface Strategy {
    double performOperation(double num1, double num2);
}

class AdditionStrategy implements Strategy {
    public double performOperation(double num1, double num2) {
        return num1 + num2;
    }
}

class SubstractionStrategy implements Strategy {
    public double performOperation(double num1, double num2) {
        return num1 - num2;
    }
}

class MultiplicationStrategy implements Strategy {
    public double performOperation(double num1, double num2) {
        return num1 * num2;
    }
}
