package Tuan04;

import java.util.Scanner;

public class main_Cau5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DSHocVien dshv = new DSHocVien();
        DSNhanVienQL dsnvql = new DSNhanVienQL();
        DSGiaoVien dsgv = new DSGiaoVien();
        int choose;
        do {
            System.out.println("\n1. Nhap danh sach hoc vien");
            System.out.println("2. Nhap danh sach nhan vien quan ly");
            System.out.println("3. Nhap danh sach giao vien");
            System.out.println("4. Xuat  danh sach hoc vien");
            System.out.println("5. Xuat  danh sach nhan vien quan ly");
            System.out.println("6. Xuat  danh sach giao vien");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    dshv.nhapDSHocVien();
                    break;
                case 2:
                    dsnvql.nhapDSNhanVien();
                    break;
                case 3:
                    dsgv.nhapDSGiaoVien();
                    break;
                case 4:
                    dshv.xuatDSHocVien();
                    break;
                case 5:
                    dsnvql.xuatDSNhanVien();
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

