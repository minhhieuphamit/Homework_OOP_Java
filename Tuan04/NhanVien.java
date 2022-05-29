package Tuan04;

import java.util.Scanner;

public class NhanVien extends Nguoi{
    private float luong;
    private ngayThangNam ngayNhanViec;
    private PhongBanKhoa PBK;

    public NhanVien(){
    }

    public NhanVien(String hoTen, ngayThangNam ngaySinh, float luong, ngayThangNam ngayNhanViec, PhongBanKhoa PBK){
        super(hoTen, ngaySinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.PBK = PBK;
    }

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap luong: ");
        this.luong = sc.nextFloat();
        System.out.print("Nhap ngay nhan viec: ");
        this.ngayNhanViec = new ngayThangNam();
        this.ngayNhanViec.nhapNgayThang();
        this.PBK = new PhongBanKhoa();
        this.PBK.nhapPhongBan();
    }

    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("%-20s%-20s", luong, ngayNhanViec.toString());
        this.PBK.xuatPhongBan();
    }
}
