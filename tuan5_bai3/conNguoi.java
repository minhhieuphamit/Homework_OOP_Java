/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan5_bai3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public abstract class conNguoi {
    private String hoTen;
    private ngayThangNam ngaySinh;

    public conNguoi(){
    }

    public conNguoi(String hoTen, ngayThangNam ngaySinh){
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen(){
        return this.hoTen;
    }

    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }

    public ngayThangNam getNgaySinh(){
        return this.ngaySinh;
    }

    public void setNgaySinh(ngayThangNam ngaySinh){
        this.ngaySinh = ngaySinh;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        this.ngaySinh = new ngayThangNam();
        this.ngaySinh.nhapNgayThang();
    }

    public void xuat(){
        System.out.printf("\n%-20s%-20s", hoTen, ngaySinh.toString());
    }
}