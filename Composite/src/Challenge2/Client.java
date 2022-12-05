package Challenge2;

public class Client {
    public static void main(String[] args) {
        Supervisor dean = new Supervisor("Dean", "Dean of Technology");
        Supervisor mathChair = new Supervisor("Math Chair", "Chair of Math Department");
        Supervisor csChair = new Supervisor("CS Chair", "Chair of CS Department");
        Professor mathProf1 = new Professor("Math Professor 1", "Adjunct");
        Professor mathProf2 = new Professor("Math Professor 2", "Associate");
        Professor csProf1 = new Professor("CS Professor 1", "Adjunct");
        Professor csProf2 = new Professor("CS Professor 2", "Professor");
        Professor csProf3 = new Professor("CS Professor 3", "Professor");

        dean.add(mathChair);
        mathChair.add(mathProf1);
        mathChair.add(mathProf2);

        dean.add(csChair);
        csChair.add(csProf1);
        csChair.add(csProf2);
        csChair.add(csProf3);

        dean.getDetails();

        csChair.remove(csProf2);
        dean.getDetails();
    }
}
