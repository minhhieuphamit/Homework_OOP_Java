package Tuan04;
import java.util.Scanner;

public class HangHoa {
    private String maHang, tenHang, nhaSanXuat;
    private float gia;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, String nhaSanXuat, float gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhaSanXuat = nhaSanXuat;
        this.gia = gia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public void nhapHang(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        this.maHang = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        this.tenHang = sc.nextLine();
        System.out.print("Nhap nha san xuat: ");
        this.nhaSanXuat = sc.nextLine();
        System.out.print("Nhap gia: ");
        this.gia = sc.nextFloat();
    }

    public void xuatHang(){
        System.out.printf("%-10s %-20s %-20s %-20s", this.maHang, this.tenHang, this.nhaSanXuat, this.gia);
    }
}
