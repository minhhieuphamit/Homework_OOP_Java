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

public class nhanVienCLC extends nhanVien {

    private String trinhDo, nganh, noiDaoTao;

    public nhanVienCLC() {
    }

    public nhanVienCLC(String hoTen, ngayThangNam ngaySinh, float luong, ngayThangNam ngayNhanViec, PhongBanKhoa PBK, String trinhDo, String nganh, String noiDaoTao) {
        super(hoTen, ngaySinh, luong, ngayNhanViec, PBK);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap trinh do: ");
        this.trinhDo = sc.nextLine();
        System.out.print("Nhap nganh: ");
        this.nganh = sc.nextLine();
        System.out.print("Nhap noi dao tao: ");
        this.noiDaoTao = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%-20s%-20s%-20s", trinhDo, nganh, noiDaoTao);
    }
}
