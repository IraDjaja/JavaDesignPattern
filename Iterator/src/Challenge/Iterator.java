package Challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public interface Iterator {
    void first();
    String next();
    boolean isDone();
    String currentItem();
}

class ScienceIterator implements Iterator {
    LinkedList<String> subjects = new LinkedList<String>();

    int pos = 0;

    public ScienceIterator(LinkedList<String> subjects) {
        this.subjects = subjects;
    }

    public void first() {
        pos = 0;
    }

    public String next() {
        return subjects.get(pos++);
    }

    public boolean isDone() {
        return pos >= subjects.size();
    }

    public String currentItem() {
        return subjects.get(pos);
    }
}

class ArtsIterator implements Iterator {
    ArrayList<String> subjects = new ArrayList<String>();
    int pos = 0;

    public ArtsIterator(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public void first() {
        pos = 0;
    }

    public String next() {
        return subjects.get(pos++);
    }

    public boolean isDone() {
        return pos >= subjects.size();
    }

    public String currentItem() {
        return subjects.get(pos);
    }
}
