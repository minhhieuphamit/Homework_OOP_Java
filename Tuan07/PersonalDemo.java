package Tuan07;

import java.util.Scanner;

public class PersonalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonalModel pm = new PersonalModel();
        byte choose;
        do {
            System.out.println("1. Add Student");
            System.out.println("2. Add Employee");
            System.out.println("3. Display");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choose = sc.nextByte();
            switch (choose) {
                case 1:
                    Student s = new Student();
                    s.input();
                    pm.addStudent(s);
                    break;
                case 2:
                    Employee e = new Employee();
                    e.input();
                    pm.addEmployee(e);
                    break;
                case 3:
                    pm.display();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.print("\nPress Enter to continue...");
            sc.nextLine();
            sc.nextLine();
        } while (choose != 0);
    }
}
