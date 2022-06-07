package Tuan05;

import java.util.Scanner;

public class HinhChuNhat extends Hinh{
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(){
    }

    public HinhChuNhat(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        this.chieuDai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        this.chieuRong = sc.nextDouble();
    }

    @Override
    public double chuVi(){
        return (this.chieuDai + this.chieuRong) * 2;
    }

    @Override
    public double dienTich(){
        return this.chieuDai * this.chieuRong;
    }

    @Override
    public void xuat(){
        System.out.printf("Chu vi hinh chu nhat co chieu dai %.2f va chieu rong %.2f la: %.2f\n", this.chieuDai, this.chieuRong, this.chuVi());
        System.out.printf("Dien tich hinh chu nhat co chieu dai %.2f va chieu rong %.2f la: %.2f\n\n", this.chieuDai, this.chieuRong, this.dienTich());
    }
}
