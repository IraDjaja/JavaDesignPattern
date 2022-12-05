package Challenge2;

public class Context {

    private String input;

    public Context(String input) {
        this.input = input;
    }

    public boolean getResult(String data) {
        if (this.input.contains(data)) {
            return true;
        }
        return false;
    }
}
