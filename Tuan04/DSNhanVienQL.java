package Tuan04;

import java.util.Scanner;
import java.util.ArrayList;

public class DSNhanVienQL {
    private ArrayList<NVQuanLy> dsnv;
    private int soLuong;

    public DSNhanVienQL(){
        dsnv = new ArrayList<NVQuanLy>();
        soLuong = 0;
    }

    public DSNhanVienQL(ArrayList<NVQuanLy> dsnv){
        this.dsnv = dsnv;
        soLuong = dsnv.size();
    }

    public void nhapDSNhanVien(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        soLuong = sc.nextInt();
        for (int i = 0; i < soLuong; i++) {
            System.out.print("\nNhap thong tin nhan vien thu " + (i + 1) + ": ");
            dsnv.add(new NVQuanLy());
            dsnv.get(i).nhap();
        }
    }

    public void xuatDSNhanVien(){
        for (NVQuanLy nv : dsnv) {
            nv.xuat();
        }
    }
}
