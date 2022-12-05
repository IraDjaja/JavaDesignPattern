package Challenge;

public class Client {
    public static void main(String[] args) {
        CricketData cricketData = new CricketData();
        Observer obs1 = new AverageScore();
        Observer obs2 = new CurrentScore();

        cricketData.register(obs1);
        cricketData.register(obs2);

        cricketData.dataChanged();
        cricketData.unregister(obs1);

        cricketData.dataChanged();
    }
}
