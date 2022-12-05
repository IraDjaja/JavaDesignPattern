package Challenge;

interface Observer {
    void update(int runs, int wickets, float overs);
}

class AverageScore implements Observer {

    public void update(int runs, int wickets, float overs) {
        double runRate = runs / overs;
        double predictedScore = runRate * 50;

        System.out.println("Average score");
        System.out.println("Run rate: " + runRate);
        System.out.println("Predited score: " + predictedScore);
    }
}

class CurrentScore implements Observer {

    public void update(int runs, int wickets, float overs) {
        double runRate = runs / overs;
        double predictedScore = runRate * 50;

        System.out.println("Current score");
        System.out.println("Runs: " + runs);
        System.out.println("Wickets: " + wickets);
        System.out.println("Overs: " + overs);
    }
}