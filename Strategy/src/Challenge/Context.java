package Challenge;

public class Context {

    public double performOperation(Strategy strategy, int num1, int num2) {
        return strategy.performOperation(num1, num2);
    }
}
