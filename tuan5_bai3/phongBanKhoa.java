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
public class phongBanKhoa {
    private String maPhongBan, tenPhongBan;

    public phongBanKhoa() {
    }

    public phongBanKhoa(String maPhongBan, String tenPhongBan) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public void nhapPhongBan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma phong ban: ");
        this.maPhongBan = sc.nextLine();
        System.out.print("Nhap ten phong ban: ");
        this.tenPhongBan = sc.nextLine();
    }

    public void xuatPhongBan() {
        System.out.printf("%-20s%-20s", this.maPhongBan, this.tenPhongBan);
    }
}
