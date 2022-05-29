package Tuan04;

import java.util.Scanner;
import java.util.ArrayList;

public class DSHocVien {
    /*private HocVien[] dshv;
    private int n;

    public DSHocVien() {
        dshv = new HocVien[100];
        n = 0;
    }

    public void nhapDSHocVien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("\nNhap thong tin hoc sinh thu " + (i + 1) + ": ");
            dshv[i] = new HocVien();
            dshv[i].nhap();
        }
    }

    public void xuatDSHocVien() {
        for (int i = 0; i < n; i++) {
            dshv[i].xuat();
        }
    }*/

   // xây dựng danh sách bằng arrays list
    private ArrayList<HocVien> dshv;
    private int soLuong;

    public DSHocVien(){
        dshv = new ArrayList<HocVien>();
        soLuong = 0;
    }

    public DSHocVien(ArrayList<HocVien> dshv){
        this.dshv = dshv;
        soLuong = dshv.size();
    }

    public void nhapDSHocVien(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        soLuong = sc.nextInt();
        for (int i = 0; i < soLuong; i++) {
            System.out.print("\nNhap thong tin hoc sinh thu " + (i + 1) + ": ");
            dshv.add(new HocVien());
            dshv.get(i).nhap();
        }
    }

    public void xuatDSHocVien(){
        for (HocVien hv : dshv) {
            hv.xuat();
        }
    }
}
