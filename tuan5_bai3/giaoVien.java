/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan5_bai3;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class giaoVien extends nhanVienCLC {

    private float thuLaoGD;

    public giaoVien() {
    }

    public giaoVien(String hoTen, ngayThangNam ngaySinh, float luong, ngayThangNam ngayNhanViec, phongBanKhoa PBK, String trinhDo, String nganh, String noiDaoTao, float thuLaoGD) {
        super(hoTen, ngaySinh, luong, ngayNhanViec, PBK, trinhDo, nganh, noiDaoTao);
        this.thuLaoGD = thuLaoGD;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thu lao giang day: ");
        this.thuLaoGD = sc.nextFloat();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%-20s\n", thuLaoGD);
    }
}
