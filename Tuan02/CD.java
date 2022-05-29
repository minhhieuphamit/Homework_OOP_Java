package Tuan02;

import java.util.Scanner;

public class CD {
    private int MaCD;
    private String TuaCD;
    private int soBaiHat;
    private float giaThanh;

    public CD() {
    }

    public CD(int MaCD, String TuaCD, int soBaiHat, float giaThanh) {
        this.MaCD = MaCD;
        this.TuaCD = TuaCD;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public int getMaCD() {
        return MaCD;
    }

    public void setMaCD(int maCD) {
        this.MaCD = maCD;
    }

    public String getTuaCD() {
        return TuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.TuaCD = tuaCD;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public float getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }

    public void nhapCD(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ma CD: ");
        MaCD = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap tua CD: ");
        TuaCD = sc.nextLine();
        System.out.print("Nhap so bai hat: ");
        soBaiHat = sc.nextInt();
        System.out.print("Nhap gia thanh: ");
        giaThanh = sc.nextFloat();
    }

    public void xuatCD(){
        System.out.printf("\n%-10d%-10s%-10d%-10.2f", MaCD, TuaCD, soBaiHat, giaThanh);
    }
}

