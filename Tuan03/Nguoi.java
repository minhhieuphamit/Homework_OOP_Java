package Tuan03;

import java.util.Scanner;

public class Nguoi {
    protected String soCMND, hoTen, diaChi;
    protected ngayThangNam ngaySinh;

    public Nguoi(){
    }

    public Nguoi(String soCMND, String hoTen, String diaChi, ngayThangNam ngaySinh){
        this.soCMND = soCMND;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
    }

    public String getSoCMND(){
        return this.soCMND;
    }

    public void setSoCMND(String soCMND){
        this.soCMND = soCMND;
    }

    public String getHoTen(){
        return this.hoTen;
    }

    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }

    public String getDiaChi(){
        return this.diaChi;
    }

    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }

    public ngayThangNam getNgaySinh(){
        return this.ngaySinh;
    }

    public void setNgaySinh(ngayThangNam ngaySinh){
        this.ngaySinh = ngaySinh;
    }

    public void nhap(){
        System.out.print("\nNhap so CMND: ");
        this.soCMND = new Scanner(System.in).nextLine();
        System.out.print("Nhap ho ten: ");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.print("Nhap dia chi: ");
        this.diaChi = new Scanner(System.in).nextLine();
        this.ngaySinh = new ngayThangNam();
        this.ngaySinh.nhapNgayThang();
    }

    public void xuat(){
        System.out.printf("%-10s %-30s %-30s %-8s\t\t", this.soCMND, this.hoTen, this.diaChi, this.ngaySinh.toString());
    }
}
