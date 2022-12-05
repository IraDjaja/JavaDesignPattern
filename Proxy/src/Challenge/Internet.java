package Challenge;

import java.util.ArrayList;
import java.util.Arrays;

public interface Internet {
    void connect(String serverhost);
}

class RealInternet implements Internet {
    @Override
    public void connect(String serverhost) {
        System.out.println("Connected to the internet...");
    }
}

class ProxyInternet implements Internet {
    RealInternet realInternet;

    private ArrayList<String> restrictedSites = new ArrayList<String>(Arrays.asList(new String[] {"bannedSite"}));
    @Override
    public void connect(String serverhost) throws Exception {
        if (restrictedSites.contains(serverhost)) {
            throw new Exception("Access denied");
        }
        if (realInternet == null) {
            System.out.println("Create internet");
            realInternet = new RealInternet();
        }
        realInternet.connect(serverhost);
    }
}
