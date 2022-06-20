package Tuan07;

import java.util.Scanner;

public class Student {
    private String id, name;
    private int age;

    public Student() {
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = sc.next();
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    public String toString() {
        return String.format("%-10s %-30s %-10d", id, name, age);
    }
}
