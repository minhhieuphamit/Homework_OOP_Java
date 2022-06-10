package Tuan04;

import java.util.Scanner;

public class NhanVienCLC extends NhanVien{
    private String trinhDo, nganh, noiDaoTao;

    public NhanVienCLC(){
    }

    public NhanVienCLC(String hoTen, ngayThangNam ngaySinh, float luong, ngayThangNam ngayNhanViec, PhongBanKhoa PBK, String trinhDo, String nganh, String noiDaoTao){
        super(hoTen, ngaySinh, luong, ngayNhanViec, PBK);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    @Override
    public void nhap(){
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
    public void xuat(){
        super.xuat();
        System.out.printf("%-20s%-20s%-20s", trinhDo, nganh, noiDaoTao);
    }
}
