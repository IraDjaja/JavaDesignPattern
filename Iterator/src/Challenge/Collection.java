package Challenge;

import java.util.ArrayList;
import java.util.LinkedList;

interface Collection {
    Iterator createIterator();
}

class ScienceCollection implements Collection {
    LinkedList<String> scienceSubjects = new LinkedList<String>();
    
    public ScienceCollection() {
        scienceSubjects.addLast("Science 1");
        scienceSubjects.addLast("Science 2");
        scienceSubjects.addLast("Science 3");
    }
    public Iterator createIterator() {
        return new ScienceIterator(scienceSubjects);
    }
}

class ArtCollection implements Collection {
    ArrayList<String> artSubjects = new ArrayList<String>();

    public ArtCollection() {
        artSubjects.add("Art 1");
        artSubjects.add("Art 2");
        artSubjects.add("Art 3");
    }
    public Iterator createIterator() {
        return new ArtsIterator(artSubjects);
    }
}
