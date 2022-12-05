package Challenge;

public interface State {
    void alert();
}

class Vibration implements State {
    public void alert() {
        System.out.println("Vibrate");
    }
}

class Silent implements State {
    public void alert() {
        System.out.println("Silent");
    }
}