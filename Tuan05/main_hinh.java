package Tuan05;

import java.util.Scanner;
import java.util.ArrayList;

public class main_hinh {
    public static void main(String[] args) {
        byte choose;
        Scanner sc = new Scanner(System.in);
        listShape lsh = new listShape();
        do {
            System.out.print("1. Them hinh vuong");
            System.out.print("\n2. Them hinh tron");
            System.out.print("\n3. Them hinh chu nhat");
            System.out.print("\n4. Xuat hinh theo loai");
            System.out.print("\n5. Xuat tat ca hinh");
            System.out.print("\n0. Ket thuc");
            System.out.print("\nNhap lua chon: ");
            choose = sc.nextByte();
            switch (choose) {
                case 1:
                    HinhVuong hv = new HinhVuong();
                    hv.nhap();
                    lsh.themHinh(hv);
                    break;
                case 2:
                    HinhTron ht = new HinhTron();
                    ht.nhap();
                    lsh.themHinh(ht);
                    break;
                case 3:
                    HinhChuNhat hcn = new HinhChuNhat();
                    hcn.nhap();
                    lsh.themHinh(hcn);
                    break;
                case 4:
                    System.out.print("1. Xuat hinh vuong");
                    System.out.print("\n2. Xuat hinh tron");
                    System.out.print("\n3. Xuat hinh chu nhat");
                    System.out.print("\nNhap lua chon: ");
                    choose = sc.nextByte();
                    lsh.xuatHinhTheoLoai(choose);
                    break;
                case 5:
                    lsh.xuatHinh();
                    break;
                case 6:
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

