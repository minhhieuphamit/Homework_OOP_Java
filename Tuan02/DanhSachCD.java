package Tuan02;

import java.util.Scanner;

public class DanhSachCD {
    private CD[] cd;
    private int n;

    public DanhSachCD() {
        cd = new CD[100];
        n = 0;
    }

    public void nhapDSCD() {
        System.out.print("Nhap so luong CD: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("\nNhap thong tin CD thu " + (i + 1) + ": ");
            cd[i] = new CD();
            cd[i].nhapCD();
        }
    }

    public void xuatDSCD() {
        System.out.print("\nDanh sach CD: ");
        for (int i = 0; i < n; i++) {
            cd[i].xuatCD();
        }
    }

    public void sapXep() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (cd[i].getMaCD() < cd[j].getMaCD()) {
                    CD temp = cd[i];
                    cd[i] = cd[j];
                    cd[j] = temp;
                }
            }
        }
    }
}
