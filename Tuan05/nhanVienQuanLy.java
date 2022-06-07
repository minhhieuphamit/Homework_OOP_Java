package Tuan05;

import java.util.Scanner;

public class nhanVienQuanLy extends NhanVien {
    private double phuCapChucVu;

    public nhanVienQuanLy() {
    }

    public nhanVienQuanLy(double phuCapChucVu) {
        this.phuCapChucVu = phuCapChucVu;
    }

    public double luong() {
        return this.luongCoBan + this.phuCapChucVu;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        this.maNV = sc.nextInt();
        sc.nextLine();
        System.out.print("\nNhap ho ten nhan vien: ");
        this.hoTen = sc.nextLine();
        System.out.print("\nNhap nam sinh nhan vien: ");
        this.namSinh = sc.nextInt();
        sc.nextLine();
        System.out.print("\nNhap trinh do nhan vien: ");
        this.trinhDo = sc.nextLine();
        System.out.print("\nNhap truong dao tao nhan vien: ");
        this.truongDaoTao = sc.nextLine();
        System.out.print("\nNhap chuyen mon nhan vien: ");
        this.chuyenMon = sc.nextLine();
        System.out.print("\nNhap luong co ban nhan vien: ");
        this.luongCoBan = sc.nextDouble();
        sc.nextLine();
        System.out.print("\nNhap phu cap chuc vu nhan vien: ");
        this.phuCapChucVu = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void xuat() {
        System.out.printf("\n%-10s %-20s %-10s %-20s %-10s %-20s %-10s %-20s %-10s", maNV, hoTen, namSinh, trinhDo, truongDaoTao, chuyenMon, luongCoBan, phuCapChucVu, luong());
    }

    @Override
    public String getLuong() {
        return this.maNV + "\t" + this.hoTen + "\t" + this.luong();
    }
}
