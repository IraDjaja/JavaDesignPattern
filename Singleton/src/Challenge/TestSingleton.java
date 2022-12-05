package Challenge;

public class TestSingleton {
    public static void main(String[] args) {
        System.out.println("Trying to make a captain for our team");
        CaptainSingleton captain = CaptainSingleton.getInstance();
        System.out.println("Trying to make another captain for our team");
        CaptainSingleton captain2 = CaptainSingleton.getInstance();
        if (captain == captain2) {
            System.out.println("c1 and c2 are the same instance");
        }
    }
}
