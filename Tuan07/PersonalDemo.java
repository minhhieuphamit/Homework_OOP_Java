package Tuan07;

import java.util.Scanner;

public class PersonalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonalModel<Student> stu = new PersonalModel<Student>();
        PersonalModel<Employee> emp = new PersonalModel<Employee>();

        byte choose;
        do {
            System.out.println("1. Add student");
            System.out.println("2. Add employee");
            System.out.println("3. Display student");
            System.out.println("4. Display employee");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choose = sc.nextByte();
            switch (choose) {
                case 1:
                    Student s = new Student();
                    s.input();
                    stu.add(s);
                    break;
                case 2:
                    Employee e = new Employee();
                    e.input();
                    emp.add(e);
                    break;
                case 3:
                    stu.display();
                    break;
                case 4:
                    emp.display();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println("\nPress enter to continue...");
            sc.nextLine();
            sc.nextLine();
        } while (choose != 0);
    }
}
