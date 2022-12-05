package Challenge;

import java.util.ArrayList;
import java.util.List;

interface Subject {
    void register(Observer obs);

    void unregister(Observer obs);

    void notifyObservers();
}

class CricketData implements Subject {
    int runs = 1;
    int wickets = 1;
    int overs = 1;

    private List<Observer> observers;

    public CricketData() {
        observers = new ArrayList<Observer>();
    }

    public void register(Observer obs) {
        observers.add(obs);
    }

    public void unregister(Observer obs) {
        observers.remove(obs);
    }

    public void notifyObservers() {
        for (Observer obs: observers) {
            obs.update(runs, wickets, overs);
        }
    }

    public void dataChanged() {
        this.runs = 2;
        this.wickets = 2;
        this.overs = 1;
        notifyObservers();
    }
}
