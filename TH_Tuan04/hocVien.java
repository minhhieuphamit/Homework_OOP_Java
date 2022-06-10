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
public class hocVien extends conNguoi{
    private float diem1, diem2, diem3;

    public hocVien(){
    }

    public hocVien(String hoTen, ngayThangNam ngaySinh, float diem1, float diem2, float diem3){
        super(hoTen, ngaySinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public float getDiem1() {
        return diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }
 
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem 1: ");
        diem1 = sc.nextFloat();
        System.out.print("Nhap diem 2: ");
        diem2 = sc.nextFloat();
        System.out.print("Nhap diem 3: ");
        diem3 = sc.nextFloat();
    }

    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("%-20s%-20s%-20s\n", diem1, diem2, diem3);
    }
}


