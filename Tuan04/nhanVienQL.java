/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan04;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class nhanVienQL extends nhanVienCLC{
    private float phuCapCV;

    public nhanVienQL(){
    }

    public nhanVienQL(String hoTen, ngayThangNam ngaySinh, float luong, ngayThangNam ngayNhanViec, PhongBanKhoa PBK, String trinhDo, String nganh, String noiDaoTao, float phuCapCV){
        super(hoTen, ngaySinh, luong, ngayNhanViec, PBK, trinhDo, nganh, noiDaoTao);
        this.phuCapCV = phuCapCV;
    }

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phu cap: ");
        this.phuCapCV = sc.nextFloat();
    }

    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("%-20s\n", phuCapCV);
    }
}