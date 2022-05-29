package Tuan04;

import java.util.Scanner;

public class HangDienMay extends HangHoa{
    private int thoiGianBaoHanh, dienAp, congSuat;

    public HangDienMay() {
    }

    public HangDienMay(String maHang, String tenHang, String nhaSanXuat, float gia, int thoiGianBaoHanh, int dienAp, int congSuat) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getDienAp() {
        return dienAp;
    }

    public void setDienAp(int dienAp) {
        this.dienAp = dienAp;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public void nhapHang(){
        super.nhapHang();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh: ");
        this.thoiGianBaoHanh = sc.nextInt();
        System.out.print("Nhap dien ap: ");
        this.dienAp = sc.nextInt();
        System.out.print("Nhap cong suat: ");
        this.congSuat = sc.nextInt();
    }

    @Override
    public void xuatHang(){
        super.xuatHang();
        System.out.printf("%-20s%-20s%-20s\n", this.thoiGianBaoHanh, this.dienAp, this.congSuat);
    }
}
