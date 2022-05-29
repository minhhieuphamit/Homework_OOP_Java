package Tuan03;

import java.util.Scanner;

public class QL_DSSV {
    private SinhVien[] dssv;
    private int n;

    public QL_DSSV() {
        dssv = new SinhVien[100];
        n = 0;
    }

    public void nhapDSSV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("\nNhap thong tin hoc sinh thu " + (i + 1) + ": ");
            dssv[i] = new SinhVien();
            dssv[i].nhap();
        }
    }

    public void xuatDSSV() {
        for (int i = 0; i < n; i++) {
            dssv[i].xuat();
        }
    }

}
