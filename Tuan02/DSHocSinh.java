package Tuan02;

import java.util.Scanner;

public class DSHocSinh {
    private HocSinh[] ds;
    private int n;

    public DSHocSinh() {
        ds = new HocSinh[100];
        n = 0;
    }

    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("\nNhap thong tin hoc sinh thu " + (i + 1) + ": ");
            ds[i] = new HocSinh();
            ds[i].nhap();
        }
    }

    public void xuatDS() {
        System.out.println("\nDanh sach hoc sinh: ");
        for (int i = 0; i < n; i++) {
            ds[i].xuat();
        }
    }

    public void sapXep() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ds[i].getDTB() < ds[j].getDTB()) {
                    HocSinh temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }

    public void doiTenHS(String ten) {
        for (int i = 0; i < n; i++) {
            if (ds[i].getHoTen().equalsIgnoreCase(ten)) {
                System.out.println("\nThong tin hoc sinh tim thay: ");
                ds[i].xuat();
                ds[i].doiTen();
                break;
            }
        }
    }

    //them 1 hoc sinh vao ds
    public void themHS(HocSinh hs){
        ds[n] = hs;
        n++;
    }

    public void themHS(){
        HocSinh hs = new HocSinh();
        hs.nhap();
        themHS(hs);
    }
}
