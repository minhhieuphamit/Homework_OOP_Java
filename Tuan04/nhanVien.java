/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan04;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class nhanVien extends conNguoi{
    private float luong;
    private ngayThangNam ngayNhanViec;
    private PhongBanKhoa PBK;

    public nhanVien(){
    }

    public nhanVien(String hoTen, ngayThangNam ngaySinh, float luong, ngayThangNam ngayNhanViec, PhongBanKhoa PBK){
        super(hoTen, ngaySinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.PBK = PBK;
    }

    public float getLuong() {
        return luong;
    }

    public ngayThangNam getNgayNhanViec() {
        return ngayNhanViec;
    }

    public PhongBanKhoa getPBK() {
        return PBK;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public void setNgayNhanViec(ngayThangNam ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
    }

    public void setPBK(PhongBanKhoa PBK) {
        this.PBK = PBK;
    }
    
    

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap luong: ");
        this.luong = sc.nextFloat();
        System.out.print("Nhap ngay nhan viec: ");
        this.ngayNhanViec = new ngayThangNam();
        this.ngayNhanViec.nhapNgayThang();
        this.PBK = new PhongBanKhoa();
        this.PBK.nhapPhongBan();
    }

    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("%-20s%-20s", luong, ngayNhanViec.toString());
        this.PBK.xuatPhongBan();
    }
}