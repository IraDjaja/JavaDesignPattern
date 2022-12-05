package Implementation;

public interface RobotInterface {
    void print();

    // extrinsic data
    void setColor(String colorOfRobot);
}

class Robot implements RobotInterface {
    String robotType;
    public String colorOfRobot;

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public void setColor(String colorOfRobot) {
        this.colorOfRobot = colorOfRobot;
    }

    public void print() {
        System.out.println("Type: " + robotType + " Color: " + colorOfRobot);
    }
}