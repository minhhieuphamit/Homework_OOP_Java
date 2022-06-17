/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_interface;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
import java.util.ArrayList;

public class listShape {
    private ArrayList<Hinh> dsHinh;

    public listShape(){
        dsHinh = new ArrayList<Hinh>();
    }

    public listShape(ArrayList<Hinh> dsHinh){
        this.dsHinh = dsHinh;
    }

    public void themHinh(Hinh h){
        if (h instanceof hinhVuong){
            dsHinh.add((hinhVuong) h);
        }
        else if (h instanceof hinhTron){
            dsHinh.add((hinhTron) h);
        }
        else if (h instanceof hinhChuNhat){
            dsHinh.add((hinhChuNhat) h);
        }
    }

    public void xuatHinh(){
        for (Hinh h : dsHinh)
            h.xuat();
    }
}
