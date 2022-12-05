package Implementation;

public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer(100, "Ivone", "Software Implementation.Developer");
        Employee dev2 = new Developer(101, "Ryo", "Software Implementation.Developer");

        Manager engManager = new Manager("Mike", 1000);
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);

        Employee dev3 = new Developer(102, "Nasya", "Implementation.Developer");
        Manager generalManager = new Manager("Mark", 1000);
        generalManager.addEmployee(dev3);
        generalManager.addEmployee(engManager);
        generalManager.showEmployeeDetails();
    }
}
