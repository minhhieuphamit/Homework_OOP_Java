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

public abstract class nhanVien {

    private int maNV, namSinh;
    private String hoTen, trinhDo;
    protected long luongCoBan;

    protected void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        this.maNV = sc.nextInt();
        sc.nextLine();
        System.out.print("\nNhap ho ten nhan vien: ");
        this.hoTen = sc.nextLine();
        //sc.nextLine();
        System.out.print("\nNhap nam sinh nhan vien: ");
        this.namSinh = sc.nextInt();
        //sc.nextLine();
        System.out.print("\nNhap trinh do nhan vien: ");
        this.trinhDo = sc.nextLine();
        sc.nextLine();
        System.out.print("\nNhap luong co ban nhan vien: ");
        this.luongCoBan = sc.nextLong();
        sc.nextLine();
    }

    protected void xuat() {
        System.out.printf("\n%-10s %-20s %-10s %-20s %-20s", maNV, hoTen, namSinh, trinhDo, luongCoBan);
    }

    protected abstract long tinhLuong();

    public nhanVien() {
    }

    public nhanVien(int maNV, String hoTen, int namSinh, String trinhDo, long luongCoBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.trinhDo = trinhDo;
        this.luongCoBan = luongCoBan;
    }
}
