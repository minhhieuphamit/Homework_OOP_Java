package Tuan01;

import java.util.Scanner;

public class Cau11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c;
        do {
            System.out.print("Nhap vao 1 ky tu: ");
            c = sc.next();
            if (c.length() > 1) {
                System.out.println("Nhap sai! Vui long nhap lai");
            }
        } while (c.length() != 1);
        int ascii = (int) c.charAt(0);
        System.out.println("Ki tu " + c + " co gia tri " + ascii);
    }
}
