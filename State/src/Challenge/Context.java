package Challenge;

public class Context {
    private State state;

    public Context() {
        state = new Vibration();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void alert() {
        this.state.alert();
    }
}
