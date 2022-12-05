package Challenge;

interface MovieFactory {
    HollywoodMovieInterface getHollywoodMovie();

    BollywoodMovieInterface getBollywoodMovie();
}

class ComedyMovieFactory implements MovieFactory {
    @Override
    public HollywoodMovieInterface getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }

    @Override
    public BollywoodMovieInterface getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}

class ActionMovieFactory implements MovieFactory {
    @Override
    public HollywoodMovieInterface getHollywoodMovie() {
        return new HollywoodActionMovie();
    }

    @Override
    public BollywoodMovieInterface getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}