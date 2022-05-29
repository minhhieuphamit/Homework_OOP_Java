package Tuan03;

import java.util.Scanner;


public class SinhVien extends Nguoi {
    private String maSV;
    private float diemLT, diemTH;

    public SinhVien() {
        super();
        this.maSV = "";
        this.diemLT = 0;
        this.diemTH = 0;
    }

    public SinhVien(String maSV, String hoTen, String soCMND, String diaChi, ngayThangNam ngaySinh, float diemLT, float diemTH) {
        super(hoTen, soCMND, diaChi, ngaySinh);
        this.maSV = maSV;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        this.maSV = sc.nextLine();
        do{
            System.out.print("Nhap diem ly thuyet: ");
            this.diemLT = sc.nextFloat();
            if (this.diemLT < 0 || this.diemLT > 10) {
                System.out.println("Diem khong hop le, nhap lai!");
            }
        }while (this.diemLT < 0 || this.diemLT > 10);

        do{
            System.out.print("Nhap diem thuc hanh: ");
            this.diemTH = sc.nextFloat();
            if (this.diemTH < 0 || this.diemTH > 10) {
                System.out.println("Diem khong hop le, nhap lai!");
            }
        }while (this.diemTH < 0 || this.diemTH > 10);
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%-10s%-7.2f%-7.2f\n", this.maSV, this.diemLT, this.diemTH);
    }
}

