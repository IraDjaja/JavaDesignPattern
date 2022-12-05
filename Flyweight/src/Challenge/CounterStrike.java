package Challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class CounterStrike {
    private static String[] playerType = {"terrorist", "counterterrorist"};
    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static String getRandPlayerType() {
        Random r = new Random();

        int randInt = r.nextInt(playerType.length);

        return playerType[randInt];
    }

    public static String getRandWeapon() {
        Random r = new Random();

        int randInt = r.nextInt(weapons.length);

        return weapons[randInt];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Player p = PlayerFactory.getPlayer(getRandPlayerType());
            p.assignWeapon(getRandWeapon());
            p.mission();
        }
    }
}
