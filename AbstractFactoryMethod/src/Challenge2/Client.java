package Challenge2;

public class Client {
    public static void main(String[] args) {
        MovieFactory hollywoodMovieFactory = FactoryProducer.getMovieFactory("hollywood");
        ActionInterface hollywoodActionMovie = hollywoodMovieFactory.getActionMovie();
        ComedyInterface hollywoodComedyMovie = hollywoodMovieFactory.getComedyMovie();
        System.out.println(hollywoodActionMovie.getMovieName());
        System.out.println(hollywoodComedyMovie.getMovieName());

        MovieFactory bollywoodMovieFactory = FactoryProducer.getMovieFactory("bollywood");
        ActionInterface bollywoodActionMovie = bollywoodMovieFactory.getActionMovie();
        ComedyInterface bollywoodComedyMovie = bollywoodMovieFactory.getComedyMovie();
        System.out.println(bollywoodActionMovie.getMovieName());
        System.out.println(bollywoodComedyMovie.getMovieName());
    }
}
