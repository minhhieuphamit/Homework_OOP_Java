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

public class nhanVienNghienCuu extends nhanVien {

    private String chuyenMon;
    private long phuCapDH;

    public nhanVienNghienCuu() {
    }

    public nhanVienNghienCuu(int maNV, String hoTen, int namSinh, String trinhDo, long luongCoBan, String chuyenMon, long phuCapDH) {
        super(maNV, hoTen, namSinh, trinhDo, luongCoBan);
        this.chuyenMon = chuyenMon;
        this.phuCapDH = phuCapDH;
    }

    protected long tinhLuong() {
        return this.luongCoBan + this.phuCapDH;
    }
    
    @Override
    protected void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("\nNhap phu cap doc hai cua nhan vien: ");
        this.phuCapDH = sc.nextLong();
        sc.nextLine();
        System.out.print("\nNhap chuyen mon nhan vien: ");
        this.chuyenMon = sc.nextLine();
    }

    @Override
    protected void xuat() {
        super.xuat();
        System.out.printf("%-20s %-10s\n", this.chuyenMon, tinhLuong());
    }
}
