package Tuan05;

import java.util.Scanner;

public class HinhTron extends Hinh{
    private double banKinh;

    public HinhTron(){
    }

    public HinhTron(double banKinh){
        this.banKinh = banKinh;
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        this.banKinh = sc.nextDouble();
    }

    @Override
    public double chuVi(){
        return 2 * this.PI * this.banKinh;
    }

    @Override
    public double dienTich(){
        return this.banKinh * this.banKinh * PI;
    }

    @Override
    public void xuat(){
        System.out.printf("Chu vi hinh tron co ban kinh %.2f la: %.2f\n", this.banKinh, this.chuVi());
        System.out.printf("Dien tich hinh tron co ban kinh %.2f la: %.2f\n\n", this.banKinh, this.dienTich());
    }
}
