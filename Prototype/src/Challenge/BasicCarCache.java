package Challenge;

import java.util.HashMap;

public class BasicCarCache {
    private static HashMap<String, BasicCar> carMap = new HashMap<String, BasicCar>();

    public static BasicCar getCar(String name) {
        return carMap.get(name).clone();
    }

    public static void loadCache() {
        Nano nano = new Nano();
        carMap.put(nano.getName(), nano);

        Ford ford = new Ford();
        carMap.put(ford.getName(), ford);
    }
}
