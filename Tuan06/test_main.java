package Tuan06;

import java.util.Scanner;

public class test_main {
    public static void main(String[] args) {
        mang m = new mang();

        int choose = 0;
        do {
            System.out.println("1. Nhap mang");
            System.out.println("2. Xuat mang");
            System.out.println("3. Lay phan tu");
            System.out.println("4. Sap xep tang dan");
            System.out.println("5. Sap xep giam dan");
            System.out.println("6. Them phan tu");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            Scanner sc = new Scanner(System.in);
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    m.nhapN();
                    m.a = new int[m.n];
                    m.nhapMang();
                    break;
                case 2:
                    if (m.a == null) {
                        System.out.println("Mang rong!");
                    } else {
                        m.xuatMang();
                    }
                    break;
                case 3:
                    if (m.a == null) {
                        System.out.println("Mang rong!");
                    } else {
                        m.layPhanTu();
                    }
                    break;
                case 4:
                    if (m.a == null) {
                        System.out.println("Mang rong!");
                    } else {
                        m.sapXepTangDan();
                    }
                    break;
                case 5:
                    if (m.a == null) {
                        System.out.println("Mang rong!");
                    } else {
                        m.sapXepGiamDan();
                        m.xuatMang();
                    }
                    break;
                case 6:
                    if (m.a == null) {
                        System.out.println("Mang rong!");
                    } else {
                        m.themPhanTuVaoViTri();
                    }
                    break;
                case 0:
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
            System.out.println("\n\nNhan phim enter de tiep tuc");
            sc.nextLine();
            sc.nextLine();
        }while (choose != 0);
    }
}
