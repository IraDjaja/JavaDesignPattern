package Challenge;

public class Client {
    public static void main(String[] args) {
        MovieFactory comedyMovieFactory = FactoryProducer.getFactory("COMEDY");
        HollywoodMovieInterface hollywoodComedyMovie = comedyMovieFactory.getHollywoodMovie();
        BollywoodMovieInterface bollywoodComedyMovie = comedyMovieFactory.getBollywoodMovie();
        System.out.println(hollywoodComedyMovie.getMovieName());
        System.out.println(bollywoodComedyMovie.getMovieName());

        MovieFactory actionMovieFactory = FactoryProducer.getFactory("ACTION");
        HollywoodMovieInterface hollywoodActionMovie = actionMovieFactory.getHollywoodMovie();
        BollywoodMovieInterface bollywoodActionMovie = actionMovieFactory.getBollywoodMovie();
        System.out.println(hollywoodActionMovie.getMovieName());
        System.out.println(bollywoodActionMovie.getMovieName());
    }
}
