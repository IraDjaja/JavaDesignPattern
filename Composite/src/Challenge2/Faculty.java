package Challenge2;

import java.util.ArrayList;

interface Faculty {
    void getDetails();
}

class Professor implements Faculty {
    private String name;
    private String position;

    public Professor(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void getDetails() {
        System.out.println(this.name + " " + this.position);
    }
}

class Supervisor implements Faculty {
    private String name;
    private String departmentName;

    public Supervisor(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
    }
    private ArrayList<Faculty> facultyList = new ArrayList<Faculty>();

    public void add(Faculty faculty) {
        facultyList.add(faculty);
    }

    public void remove(Faculty faculty) {
        facultyList.remove(faculty);
    }

    @Override
    public void getDetails() {
        System.out.println(this.name + " " + this.departmentName);
        for (Faculty faculty: facultyList) {
            faculty.getDetails();
        }
    }
}