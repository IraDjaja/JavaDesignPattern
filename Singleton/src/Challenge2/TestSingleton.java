package Challenge2;

import Challenge.CaptainSingleton;

public class TestSingleton {
    public static void main(String[] args) {
        CaptainSingleton captain1 = CaptainSingleton.getInstance();
        CaptainSingleton captain2 = CaptainSingleton.getInstance();
        if (captain1 == captain2) {
            System.out.println("Same");
        }
    }
}
