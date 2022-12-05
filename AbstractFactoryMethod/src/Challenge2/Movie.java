package Challenge2;

interface ComedyInterface {
    String getMovieName();
}

class HollywoodComedyMovie implements ComedyInterface {
    @Override
    public String getMovieName() {
        return "hollywood comedy movie";
    }
}

class BollywoodComedyMovie implements ComedyInterface {
    @Override
    public String getMovieName() {
        return "bollywood comedy movie";
    }
}

interface ActionInterface {
    String getMovieName();
}

class HollywoodActionMovie implements ActionInterface {
    @Override
    public String getMovieName() {
        return "hollywood action movie";
    }
}

class BollywoodActionMovie implements ActionInterface {
    @Override
    public String getMovieName() {
        return "bollywood action movie";
    }
}