package Example2;

public class Client {
    public static void main(String[] args) {
        Triangle t = new Triangle(20, 10);
        CalculatorInterface calculatorAdapter = new CalculatorAdapter(t);

        System.out.println(calculatorAdapter.getArea(null));
    }
}
