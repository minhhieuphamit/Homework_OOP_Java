/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_interface;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class main_Cau6 {

    public static void main(String[] args) {
        byte choose;
        Scanner sc = new Scanner(System.in);
        listShape lsh = new listShape();
        do {
            System.out.print("1. Them hinh vuong");
            System.out.print("\n2. Them hinh tron");
            System.out.print("\n3. Them hinh chu nhat");
            System.out.print("\n4. Xuat tat ca hinh");
            System.out.print("\n0. Ket thuc");
            System.out.print("\nNhap lua chon: ");
            choose = sc.nextByte();
            switch (choose) {
                case 1:
                    hinhVuong hv = new hinhVuong();
                    hv.nhap();
                    lsh.themHinh(hv);
                    break;
                case 2:
                    hinhTron ht = new hinhTron();
                    ht.nhap();
                    lsh.themHinh(ht);
                    break;
                case 3:
                    hinhChuNhat hcn = new hinhChuNhat();
                    hcn.nhap();
                    lsh.themHinh(hcn);
                    break;
                case 4:
                    lsh.xuatHinh();
                    break;
                case 0:
                    System.out.println("Ket thuc");
                    break;
                default:
                    System.out.println("Khong co chuc nang nay");
                    break;
            }
            System.out.println("\nNhan phim enter de tiep tuc");
            sc.nextLine();
            sc.nextLine();
        } while (choose != 0);
    }
}
