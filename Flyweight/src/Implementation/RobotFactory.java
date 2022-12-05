package Implementation;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, RobotInterface> shapes = new HashMap<String, RobotInterface>();

    public int totalObjectsCreated() {
        return shapes.size();
    }

    public RobotInterface getRobotFromFactory(String robotType) throws Exception {
        RobotInterface myRobot = null;
        if (shapes.containsKey(robotType)) {
            myRobot = shapes.get(robotType);
        } else {
            switch (robotType) {
                case "king":
                    System.out.println("Creating a king robot");
                    myRobot = new Robot("king");
                    shapes.put("king", myRobot);
                    break;
                case "queen":
                    System.out.println("Creating a queen robot");
                    myRobot = new Robot("queen");
                    shapes.put("queen", myRobot);
                    break;
                default:
                    throw new Exception("Implementation.Robot Factory can create only king and queen robot");
            }
        }
        return myRobot;
    }
}
