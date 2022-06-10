package Tuan04;

import java.util.Scanner;

public class main_Cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HocVien hv = new HocVien();
        NVQuanLy nvql = new NVQuanLy();
        GiaoVien gv = new GiaoVien();
        int choose;
        do {
            System.out.println("\n1. Nhap 1 hoc vien");
            System.out.println("2. Nhap 1 nhan vien quan ly");
            System.out.println("3. Nhap 1 giao vien");
            System.out.println("4. Xuat  1 hoc vien");
            System.out.println("5. Xuat  1 nhan vien quan ly");
            System.out.println("6. Xuat  1 giao vien");
            System.out.println("Thoat");
            System.out.print("Moi ban chon: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    hv.nhap();
                    break;
                case 2:
                    nvql.nhap();
                    break;
                case 3:
                    gv.nhap();
                    break;
                case 4:
                    hv.xuat();
                    break;
                case 5:
                    nvql.xuat();
                    break;
                case 6:
                    gv.xuat();
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

