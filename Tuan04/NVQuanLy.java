package Tuan04;

import java.util.Scanner;

public class NVQuanLy extends NhanVienCLC{
    private float phuCapCV;

    public NVQuanLy(){
    }

    public NVQuanLy(String hoTen, ngayThangNam ngaySinh, float luong, ngayThangNam ngayNhanViec, PhongBanKhoa PBK, String trinhDo, String nganh, String noiDaoTao, float phuCapCV){
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
        System.out.printf("%-20s", phuCapCV);
    }
}
