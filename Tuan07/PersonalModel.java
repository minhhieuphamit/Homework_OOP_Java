package Tuan07;

import java.util.ArrayList;

public class PersonalModel<T> {
    private ArrayList<Student> listStudent;
    private ArrayList<Employee> listEmployee;

    public PersonalModel() {
        listStudent = new ArrayList<Student>();
        listEmployee = new ArrayList<Employee>();
    }

    public PersonalModel(ArrayList<Student> listStudent, ArrayList<Employee> listEmployee) {
        this.listStudent = listStudent;
        this.listEmployee = listEmployee;
    }

    public void addStudent(Student s) {
        listStudent.add(s);
    }

    public void addEmployee(Employee e) {
        listEmployee.add(e);
    }

    public void display() {
        System.out.println("Student");
        for (Student s : listStudent) {
            System.out.println(s.toString());
        }
        System.out.println("Employee");
        for (Employee e : listEmployee) {
            System.out.println(e);
        }
    }
}
