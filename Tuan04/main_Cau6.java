package Tuan04;

import java.util.Scanner;

public class main_Cau6 {
    public static void main(String[] args) {
        CDCollection dscd = new CDCollection();
        CD cd = new CD();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1. Nhap danh sach CD");
            System.out.println("2. Xuat danh sach CD");
            System.out.println("3. Nhap thong tin 1 CD");
            System.out.println("4. Xuat thong tin 1 CD");
            System.out.println("0. Thoat");
            System.out.print("\nNhap lua chon: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    dscd.nhapDSCD();
                    break;
                case 2:
                    dscd.sapXepTheoMaCD();
                    break;
                case 3:
                    cd.nhap();
                    break;
                case 4:
                    cd.xuat();

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
