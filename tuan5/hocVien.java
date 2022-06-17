/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan5;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
import java.util.ArrayList;

public class hocVien {

    private ArrayList<nhanVien> dsnv;

    public hocVien() {
        dsnv = new ArrayList<nhanVien>();
    }

    public hocVien(ArrayList<nhanVien> dsnv) {
        this.dsnv = dsnv;
    }

    public void them(nhanVien nv) {
        if (nv instanceof nhanVienQuanLy) {
            dsnv.add((nhanVienQuanLy) nv);
        } else if (nv instanceof nhanVienNghienCuu) {
            dsnv.add((nhanVienNghienCuu) nv);
        } else if (nv instanceof nhanVienPhucVu) {
            dsnv.add((nhanVienPhucVu) nv);
        }
    }

    public void xuatDS() {
        for (nhanVien nv : dsnv) {
            nv.xuat();
        }
    }
    
    public double tinhTongLuong(){
        double tongLuong = 0;
        for (nhanVien nv: dsnv)
            tongLuong += nv.tinhLuong();
        return tongLuong;
    }
}
