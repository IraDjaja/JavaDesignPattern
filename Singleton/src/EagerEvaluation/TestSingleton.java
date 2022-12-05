package EagerEvaluation;

import LazyEvaluation.Singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.setData(55);

        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());

        s = null;
        s = Singleton.getInstance();

        System.out.println("Second reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());
    }
}
