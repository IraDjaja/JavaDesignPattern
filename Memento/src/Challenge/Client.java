package Challenge;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("1");
        originator.setState("2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("3");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("4");
        System.out.println(originator.getState());

        originator.getStateFromMemento(caretaker.get(0));
        System.out.println(originator.getState());

        originator.getStateFromMemento(caretaker.get(1));
        System.out.println(originator.getState());
    }
}
