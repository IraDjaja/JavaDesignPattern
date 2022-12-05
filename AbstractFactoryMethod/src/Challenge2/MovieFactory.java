package Challenge2;

interface MovieFactory {
    ComedyInterface getComedyMovie();
    ActionInterface getActionMovie();
}

class HollywoodMovieFactory implements MovieFactory {
    @Override
    public ComedyInterface getComedyMovie() {
        return new HollywoodComedyMovie();
    }

    @Override
    public ActionInterface getActionMovie() {
        return new HollywoodActionMovie();
    }
}

class BollywoodMovieFactory implements MovieFactory {
    @Override
    public ComedyInterface getComedyMovie() {
        return new BollywoodComedyMovie();
    }

    @Override
    public ActionInterface getActionMovie() {
        return new BollywoodActionMovie();
    }
}


