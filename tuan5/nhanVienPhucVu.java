/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan5;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class nhanVienPhucVu extends nhanVien {

    public long tinhLuong() {
        return luongCoBan;
    }

    public nhanVienPhucVu() {
    }

    public nhanVienPhucVu(int maNV, String hoTen, int namSinh, String trinhDo, long luongCoBan) {
        super(maNV, hoTen, namSinh, trinhDo, luongCoBan);
    }

    protected void nhap() {
        super.nhap();
    }

    protected void xuat() {
        super.xuat();
    }
}
