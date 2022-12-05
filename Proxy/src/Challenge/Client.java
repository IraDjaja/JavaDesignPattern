package Challenge;

public class Client {
    public static void main(String[] args) {
        ProxyInternet proxyInternet = new ProxyInternet();
        try {
            proxyInternet.connect("site");
            proxyInternet.connect("bannedSite");
            proxyInternet.connect("site");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
