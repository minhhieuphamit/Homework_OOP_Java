package Tuan04;
import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    ngayThangNam ngaySinh;

    public Nguoi(){
    }

    public Nguoi(String hoTen, ngayThangNam ngaySinh){
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen(){
        return this.hoTen;
    }

    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }

    public ngayThangNam getNgaySinh(){
        return this.ngaySinh;
    }

    public void setNgaySinh(ngayThangNam ngaySinh){
        this.ngaySinh = ngaySinh;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        this.ngaySinh = new ngayThangNam();
        this.ngaySinh.nhapNgayThang();
    }

    public void xuat(){
        System.out.printf("%-20s%-20s", hoTen, ngaySinh.toString());
    }
}
