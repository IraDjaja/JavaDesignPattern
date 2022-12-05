package Challenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Supervisor implements Faculty {
    private String name;
    private String departmentName;

    private ArrayList<Faculty> facultyList = new ArrayList<Faculty>();

    public Supervisor(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
    }

    public void add(Faculty faculty) {
        facultyList.add(faculty);
    }

    public void remove(Faculty faculty) {
        facultyList.remove(faculty);
    }

    public List<Faculty> getMyFaculty() {
        return facultyList;
    }

    @Override
    public void getDetails() {
        System.out.println(this.name);
        System.out.println(this.departmentName);

        System.out.println("Faculty List");
        Iterator<Faculty> facultyIterator = facultyList.iterator();
        while(facultyIterator.hasNext()) {
            Faculty faculty = facultyIterator.next();
            faculty.getDetails();
        }
    }
}