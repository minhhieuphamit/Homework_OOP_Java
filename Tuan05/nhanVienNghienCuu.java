package Tuan05;

import java.util.Scanner;

public class nhanVienNghienCuu extends NhanVien {
    private double phuCapDocHai;

    public nhanVienNghienCuu() {
    }

    public nhanVienNghienCuu(double phuCapDocHai) {
        this.phuCapDocHai = phuCapDocHai;
    }

    public double luong() {
        return this.luongCoBan + this.phuCapDocHai;
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
        System.out.print("\nNhap phu cap doc hai nhan vien: ");
        this.phuCapDocHai = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void xuat() {
        System.out.printf("\n%-10s %-20s %-10s %-20s %-10s %-20s %-10s %-20s %-10s", maNV, hoTen, namSinh, trinhDo, truongDaoTao, chuyenMon, luongCoBan, phuCapDocHai, luong());
    }

    @Override
    public String getLuong() {
        return this.maNV + "\t" + this.hoTen + "\t" + this.luong();
    }
}
