package Challenge;

interface HollywoodMovieInterface {
    String getMovieName();
}

class HollywoodActionMovie implements HollywoodMovieInterface {
    @Override
    public String getMovieName() {
        return "Hollywood action movie";
    }
}

class HollywoodComedyMovie implements HollywoodMovieInterface {
    @Override
    public String getMovieName() {
        return "Hollywood comedy movie";
    }
}
