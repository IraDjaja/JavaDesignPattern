package Challenge;

public class CaptainSingleton {

    private CaptainSingleton() {}

    private static class CaptainSingletonHelper {
        private static CaptainSingleton _uniqueInstance = new CaptainSingleton();
    }

    public static CaptainSingleton getInstance() {
        return CaptainSingletonHelper._uniqueInstance;
    }
}
