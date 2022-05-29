package Tuan04;

import java.util.Scanner;
import java.util.ArrayList;

public class DSGiaoVien {
    private ArrayList<GiaoVien> dsgv;
    private int soLuong;

    public DSGiaoVien(){
        dsgv = new ArrayList<GiaoVien>();
        soLuong = 0;
    }

    public DSGiaoVien(ArrayList<GiaoVien> dsgv){
        this.dsgv = dsgv;
        soLuong = dsgv.size();
    }

    public void nhapDSGiaoVien(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong giao vien: ");
        soLuong = sc.nextInt();
        for (int i = 0; i < soLuong; i++) {
            System.out.print("\nNhap thong tin giao vien thu " + (i + 1) + ": ");
            dsgv.add(new GiaoVien());
            dsgv.get(i).nhap();
        }
    }

    public void xuatDSGiaoVien(){
        for (GiaoVien gv : dsgv) {
            gv.xuat();
        }
    }
}
