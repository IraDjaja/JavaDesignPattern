package Challenge2;

public class FactoryProducer {
    public static MovieFactory getMovieFactory(String movieType) {
        if (movieType == "hollywood") {
            return new HollywoodMovieFactory();
        } else if (movieType == "bollywood") {
            return new BollywoodMovieFactory();
        }
        return null;
    }
}
