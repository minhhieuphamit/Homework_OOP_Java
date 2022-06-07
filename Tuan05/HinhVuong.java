package Tuan05;

import java.util.Scanner;

public class HinhVuong extends Hinh{
    private double canh;

    public HinhVuong(){
    }

    public HinhVuong(double canh){
        this.canh = canh;
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh: ");
        this.canh = sc.nextDouble();
    }

    @Override
    public double chuVi(){
        return this.canh * 4;
    }
    @Override
    public double dienTich(){
        return this.canh * this.canh;
    }

    @Override
    public void xuat(){
        System.out.printf("Chu vi hinh vuong co canh %.2f la: %.2f\n", this.canh, this.chuVi());
        System.out.printf("Dien tich hinh vuong co canh %.2f la: %.2f\n\n", this.canh, this.dienTich());
    }
}