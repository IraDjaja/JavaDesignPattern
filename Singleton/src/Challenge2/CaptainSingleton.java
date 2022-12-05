package Challenge2;

public class CaptainSingleton {
    private CaptainSingleton () {}

    private static class CaptainSingletonHelper {
        private static CaptainSingleton uniqueInstance = new CaptainSingleton();
    }

    public static CaptainSingleton getInstance() {
        return CaptainSingletonHelper.uniqueInstance;
    }
}
