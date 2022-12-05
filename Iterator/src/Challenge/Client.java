package Challenge;

import java.util.ArrayList;

public class Client {
    public static void print(Iterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        ArtCollection artCollection = new ArtCollection();
        ScienceCollection scienceCollection = new ScienceCollection();

        Iterator artIterator = artCollection.createIterator();
        Iterator scienceIterator = scienceCollection.createIterator();

        print(artIterator);
        print(scienceIterator);
    }
}
