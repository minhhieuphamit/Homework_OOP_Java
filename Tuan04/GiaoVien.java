package Tuan04;

import java.util.Scanner;

public class GiaoVien extends NhanVienCLC{
    private float thuLaoGD;

    public GiaoVien(){
    }

    public GiaoVien(String hoTen, ngayThangNam ngaySinh, float luong, ngayThangNam ngayNhanViec, PhongBanKhoa PBK, String trinhDo, String nganh, String noiDaoTao, float thuLaoGD){
        super(hoTen, ngaySinh, luong, ngayNhanViec, PBK, trinhDo, nganh, noiDaoTao);
        this.thuLaoGD = thuLaoGD;
    }

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thu lao giang day: ");
        this.thuLaoGD = sc.nextFloat();
    }

    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("%-20s", thuLaoGD);
    }
}
