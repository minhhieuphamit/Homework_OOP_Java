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
public class main_Cau3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        listNVQL dsnvql = new listNVQL();
        listGiaoVien dsgv = new listGiaoVien();
        listHocVien dshv = new listHocVien();

        byte choose;
        do {
            System.out.println("\n1. Nhap 1 hoc vien");
            System.out.println("2. Nhap 1 nhan vien quan ly");
            System.out.println("3. Nhap 1 giao vien");
            System.out.println("4. Xuat thong tin danh sach hoc vien");
            System.out.println("5. Xuat thong tin danh sach nhan vien quan ly");
            System.out.println("6. Xuat thong tin danh sach giao vien");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon: ");
            choose = sc.nextByte();
            switch (choose) {
                case 1:
                    hocVien hv = new hocVien();
                    dshv.them1HV(hv);
                    break;
                case 2:
                    nhanVienQL nvql = new nhanVienQL();
                    dsnvql.them1NV(nvql);
                    break;
                case 3:
                    giaoVien gv = new giaoVien();
                    dsgv.them1GV(gv);
                    break;
                case 4:
                    dshv.xuatDSHocVien();
                    break;
                case 5:
                    dsnvql.xuatDSNhanVienQL();
                    break;
                case 6:
                    dsgv.xuatDSGiaoVien();
                    break;
                case 0:
                    System.out.println("\nThoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, moi ban chon lai!");
                    break;
            }
            System.out.println("\nNhan phim enter de tiep tuc");
            sc.nextLine();
            sc.nextLine();
        } while (choose != 0);
    }
}
