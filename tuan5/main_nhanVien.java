/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan5;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class main_nhanVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hocVien hv = new hocVien();
        byte choose = 0;
        do {
            System.out.println("\n1. Nhap nhan vien quan ly");
            System.out.println("2. Nhap nhan vien nghien cuu");
            System.out.println("3. Nhap nhan vien phuc vu");
            System.out.println("4. In danh sach nhan vien");
            System.out.println("5. Tinh tong luong tat ca nhan vien");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choose = sc.nextByte();
            switch (choose) {
                case 1:
                    nhanVienQuanLy nvql = new nhanVienQuanLy();
                    nvql.nhap();
                    hv.them(nvql);
                    break;
                case 2:
                    nhanVienNghienCuu nvnc = new nhanVienNghienCuu();
                    nvnc.nhap();
                    hv.them(nvnc);
                    break;
                case 3:
                    nhanVienPhucVu nvpv = new nhanVienPhucVu();
                    nvpv.nhap();
                    hv.them(nvpv);
                    break;
                case 4:
                    hv.xuatDS();
                    break;
                case 5:
                    System.out.print("Tong luong la: " + hv.tinhTongLuong());
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
