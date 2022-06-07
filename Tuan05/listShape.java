package Tuan05;

import java.util.Scanner;
import java.util.ArrayList;

public class listShape {
    private ArrayList<Hinh> hinh;
    private ArrayList<HinhVuong> hinhVuong;
    private ArrayList<HinhTron> hinhTron;
    private ArrayList<HinhChuNhat> hinhChuNhat;

    public listShape(){
        hinh = new ArrayList<Hinh>();
        hinhVuong = new ArrayList<HinhVuong>();
        hinhTron = new ArrayList<HinhTron>();
        hinhChuNhat = new ArrayList<HinhChuNhat>();
    }

    public listShape(ArrayList<Hinh> hinh, ArrayList<HinhVuong> hinhVuong, ArrayList<HinhTron> hinhTron, ArrayList<HinhChuNhat> hinhChuNhat){
        this.hinh = hinh;
        this.hinhVuong = hinhVuong;
        this.hinhTron = hinhTron;
        this.hinhChuNhat = hinhChuNhat;
    }

    public void themHinh(Hinh h){
        if (h instanceof HinhVuong){
            hinhVuong.add((HinhVuong) h);
        }
        else if (h instanceof HinhTron){
            hinhTron.add((HinhTron) h);
        }
        else if (h instanceof HinhChuNhat){
            hinhChuNhat.add((HinhChuNhat) h);
        }
    }

    public void xuatHinhTheoLoai(byte choose){
        switch (choose){
            case 1:
                for (HinhVuong h : hinhVuong){
                    h.xuat();
                }
                break;
            case 2:
                for (HinhTron h : hinhTron){
                    h.xuat();
                }
                break;
            case 3:
                for (HinhChuNhat h : hinhChuNhat){
                    h.xuat();
                }
                break;
            default:
                System.out.println("Khong co loai nay");
                break;
        }
    }

    public void xuatHinh(){
        for (HinhVuong h : hinhVuong){
            h.xuat();
        }
        for (HinhTron h : hinhTron){
            h.xuat();
        }
        for (HinhChuNhat h : hinhChuNhat){
            h.xuat();
        }
    }
}
