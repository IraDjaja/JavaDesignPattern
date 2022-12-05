package Challenge;

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String, Player> players = new HashMap<String, Player>();

    public static Player getPlayer(String type) {
        Player player = null;
        if (players.containsKey(type)) {
            player = players.get(type);
        } else {
            if (type == "terrorist") {
                System.out.println("Create terrorist");
                player = new Terrorist();
            } else {
                System.out.println("Create counter terrorist");
                player = new CounterTerrorist();
            }
        }
        players.put(type, player);
        return player;
    }
}
