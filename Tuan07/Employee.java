package Tuan07;

import java.util.Scanner;

public class Employee {
    private String id, name;
    private long salary;

    public Employee() {
    }

    public Employee(String id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = sc.next();
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter salary: ");
        salary = sc.nextLong();
    }

    public String toString() {
        return String.format("%-10s %-30s %-10d", id, name, salary);
    }
}
