package Tuan02;

import java.util.Scanner;

public class HocSinh {
    private String MaHS;
    private String hoTen;
    private float dtb;

    public HocSinh(String MaHS, String hoTen, float dtb) {
        this.MaHS = MaHS;
        this.hoTen = hoTen;
        this.dtb = dtb;
    }

    public HocSinh() {
    }

    public String getMaHS() {
        return MaHS;
    }

    public void setMaHS(String MaHS) {
        this.MaHS = MaHS;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDTB() {
        return dtb;
    }

    public void setDTB(float dtb) {
        this.dtb = dtb;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ma hoc sinh: ");
        MaHS = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap diem trung binh: ");
        dtb = sc.nextFloat();
    }

    public void xuat() {
        System.out.println(String.format("%-10s %-20s %-10s", MaHS, hoTen, dtb));
    }

    public void rank() {
        if (dtb >= 8) {
            System.out.println("Xep loai: Gioi");
        } else if (dtb >= 6.5) {
            System.out.println("Xep loai: Kha");
        } else if (dtb >= 5) {
            System.out.println("Xep loai: Trung binh");
        } else if (dtb >= 3) {
            System.out.println("Xep loai: Yeu");
        } else {
            System.out.println("Xep loai: Kem");
        }
    }

    public void doiTen() {
        System.out.print("Nhap ten moi: ");
        this.hoTen = new Scanner(System.in).nextLine();
    }
}
