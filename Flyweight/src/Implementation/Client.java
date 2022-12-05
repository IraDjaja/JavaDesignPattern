package Implementation;

import java.util.Random;

public class Client {
    public static void main(String[] args) throws Exception {
        RobotFactory myFactory = new RobotFactory();
        Robot shape = null;

        for (int i = 0; i < 2; i++) {
            shape = (Robot) myFactory.getRobotFromFactory("king");
            shape.setColor(getRandomColor());
            shape.print();
        }

        for (int i = 0; i < 2; i++) {
            shape = (Robot) myFactory.getRobotFromFactory("queen");
            shape.setColor(getRandomColor());
            shape.print();
        }

        int numRobots = myFactory.totalObjectsCreated();
        System.out.println("Number of robots: " + numRobots);
    }

    static String getRandomColor() {
        Random r = new Random();
        int random = r.nextInt(20);
        if (random%2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }
}