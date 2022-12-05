package Challenge;

interface BollywoodMovieInterface {
    String getMovieName();
}

class BollywoodActionMovie implements BollywoodMovieInterface {
    @Override
    public String getMovieName() {
        return "Bollywood action movie";
    }
}

class BollywoodComedyMovie implements BollywoodMovieInterface {
    @Override
    public String getMovieName() {
        return "Bollywood comedy movie";
    }
}