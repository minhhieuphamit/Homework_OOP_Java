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
public class main_Cau2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        listHocVien dshv = new listHocVien();
        listNhanVien dsnv = new listNhanVien();
        
        byte choose;
        do {
            System.out.println("1.Nhap 1 hoc vien");
            System.out.println("2.Nhap 1 nhan vien");
            System.out.println("3.Xuat thong tin danh sach hoc vien");
            System.out.println("4.Xuat thong tin danh sach nhan vien");
            System.out.println("5.Thoat");
            System.out.print("Nhap lua chon: ");
            choose = sc.nextByte();
            switch (choose) {
                case 1:
                    hocVien hv = new hocVien();
                    dshv.them1HV(hv);
                    break;
                case 2:
                    nhanVien nv = new nhanVien();
                    dsnv.them1NV(nv);
                    break;
                case 3:
                    dshv.xuatDSHocVien();
                    break;
                case 4:
                    dsnv.xuatDSNhanVien();
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
