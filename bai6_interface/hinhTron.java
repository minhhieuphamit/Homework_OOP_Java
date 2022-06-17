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
public class hinhTron implements Hinh{
    private double banKinh;

    public hinhTron(){
    }

    public hinhTron(double banKinh){
        this.banKinh = banKinh;
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        this.banKinh = sc.nextDouble();
    }

    @Override
    public double dienTich(){
        return this.banKinh * this.banKinh * PI;
    }

    @Override
    public void xuat(){
        System.out.printf("Dien tich hinh tron co ban kinh %.2f la: %.2f\n\n", this.banKinh, this.dienTich());
    }
}
