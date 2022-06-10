/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan04;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class main_Cau1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hocVien hv = new hocVien();
        nhanVien nv = new nhanVien();

        byte choose;
        do {
            System.out.println("1.Nhap 1 hoc vien");
            System.out.println("2.Nhap 1 nhan vien");
            System.out.println("3.Xuat thong tin 1 hoc vien");
            System.out.println("4.Xuat thong tin 1 nhan vien");
            System.out.println("5.Thoat");
            System.out.print("Nhap lua chon: ");
            choose = sc.nextByte();
            switch (choose) {
                case 1:
                    hv.nhap();
                    break;
                case 2:
                    nv.nhap();
                    break;
                case 3:
                    hv.xuat();
                    break;
                case 4:
                    nv.xuat();
                    break;
                case 5:
                    System.out.println("\nThoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, moi ban chon lai!");
                    break;
            }
            System.out.println("\nNhan phim enter de tiep tuc");
            sc.nextLine();
            sc.nextLine();
        } while (choose != 5);

    }

}
