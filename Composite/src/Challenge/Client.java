package Challenge;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Supervisor dean = new Supervisor("Dar. S. Som", "Dean of Technology");
        Supervisor mathDepartment = new Supervisor("Mrs. S. Das", "Chair of Math Department");
        Supervisor csDepartment = new Supervisor("Mr. V. Sarcar", "Chair of CS Department");

        Professor mathProf1 = new Professor("Math Professor 1", "Adjunct", "1");
        Professor mathProf2 = new Professor("Math Professor 2", "Associate", "2");
        Professor csProf1 = new Professor("CSE Professor 1", "Adjunct", "1");
        Professor csProf2 = new Professor("CSE Professor 2", "Professor", "2");
        Professor csProf3 = new Professor("CSE Professor 3", "Professor", "3");

        mathDepartment.add(mathProf1);
        mathDepartment.add(mathProf2);

        csDepartment.add(csProf1);
        csDepartment.add(csProf2);
        csDepartment.add(csProf3);

        dean.add(mathDepartment);
        dean.add(csDepartment);

        dean.getDetails();

        csDepartment.remove(csProf2);
        dean.getDetails();
    }
}
