package Tuan04;

import java.util.Scanner;

public class HocVien extends Nguoi{
    private float diem1, diem2, diem3;

    public HocVien(){
    }

    public HocVien(String hoTen, ngayThangNam ngaySinh, float diem1, float diem2, float diem3){
        super(hoTen, ngaySinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem 1: ");
        diem1 = sc.nextFloat();
        System.out.print("Nhap diem 2: ");
        diem2 = sc.nextFloat();
        System.out.print("Nhap diem 3: ");
        diem3 = sc.nextFloat();
    }

    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("%-20s%-20s%-20s\n", diem1, diem2, diem3);
    }
}
