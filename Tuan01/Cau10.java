package Tuan01;

import java.util.Scanner;

public class Cau10 {
    private String MSSV, HoTen;
    private int dtb;

    public Cau10() {
    }

    public Cau10(String MSSV, String HoTen, int dtb) {
        this.MSSV = MSSV;
        this.HoTen = HoTen;
        this.dtb = dtb;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getDTB() {
        return dtb;
    }

    public void setDTB(int dtb) {
        this.dtb = dtb;
    }


    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap MSSV: ");
        MSSV = sc.nextLine();
        System.out.print("Nhap HoTen: ");
        HoTen = sc.nextLine();
        System.out.print("Nhap DTB: ");
        dtb = sc.nextInt();
    }

    public void xuat() {
        System.out.println("\nMSSV: " + MSSV);
        System.out.println("HoTen: " + HoTen);
        System.out.println("DTB: " + dtb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        Cau10[] sv = new Cau10[n];
        for (int i = 0; i < n; i++) {
            sv[i] = new Cau10();
            sv[i].nhap();
        }
        for (int i = 0; i < n; i++) {
            sv[i].xuat();
        }

    }
}

