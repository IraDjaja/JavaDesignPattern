package Challenge;

public class FactoryProducer {
    public static MovieFactory getFactory(String choice) {
        if (choice == "COMEDY") {
            return new ComedyMovieFactory();
        } else if (choice == "ACTION") {
            return new ActionMovieFactory();
        }
        return null;
    }
}
