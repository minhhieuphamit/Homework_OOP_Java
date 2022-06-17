/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_interface;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class hinhChuNhat implements Hinh {

    private double chieuDai;
    private double chieuRong;

    public hinhChuNhat() {
    }

    public hinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        this.chieuDai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        this.chieuRong = sc.nextDouble();
    }

    @Override
    public double dienTich() {
        return this.chieuDai * this.chieuRong;
    }

    @Override
    public void xuat() {
        System.out.printf("Dien tich hinh chu nhat co chieu dai %.2f va chieu rong %.2f la: %.2f\n\n", this.chieuDai, this.chieuRong, this.dienTich());
    }
}
