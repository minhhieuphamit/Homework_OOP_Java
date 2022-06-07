package Tuan05;

import java.util.Scanner;

public class main_nhanVien {
    public static void main(String[] args) {
        /*
        Tao menu co chuc nang nhu sau:
        1. Nhap nhan vien quan ly
        2. Nhap nhan vien nghien cuu
        3. Nhap nhan vien phuc vu
        4. In danh sach nhan vien
        6. In bang luong cua cac nhan vien
        0. Thoat
         */
        Scanner sc = new Scanner(System.in);
        listEmployee le = new listEmployee();
        byte choose = 0;
        do {
            System.out.println("\n1. Nhap nhan vien quan ly");
            System.out.println("2. Nhap nhan vien nghien cuu");
            System.out.println("3. Nhap nhan vien phuc vu");
            System.out.println("4. In danh sach nhan vien");
            System.out.println("5. In bang luong cua cac nhan vien");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choose = sc.nextByte();
            switch (choose) {
                case 1:
                    nhanVienQuanLy nvql = new nhanVienQuanLy();
                    nvql.nhap();
                    le.them(nvql);
                    break;
                case 2:
                    nhanVienNghienCuu nvnc = new nhanVienNghienCuu();
                    nvnc.nhap();
                    le.them(nvnc);
                    break;
                case 3:
                    nhanVienPhucVu nvphucvu = new nhanVienPhucVu();
                    nvphucvu.nhap();
                    le.them(nvphucvu);
                    break;
                case 4:
                    le.xuatDS();
                    break;
                case 5:
                    le.xuatLuong();
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
        }
        while (choose != 0);
    }
}

