/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_interface;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class hinhVuong implements Hinh {

    private double canh;

    public hinhVuong() {
    }

    public hinhVuong(double canh) {
        this.canh = canh;
    }

    @Override
    public void nhap() {
        System.out.print("Nhap canh hinh vuong:");
        Scanner sc = new Scanner(System.in);
        this.canh = sc.nextDouble();
    }

    @Override
    public void xuat() {
        System.out.printf("Dien tich hinh vuong co canh %.2f la: %.2f\n\n", this.canh, this.dienTich());
    }

    @Override
    public double dienTich() {
        return this.canh * this.canh;
    }
}
