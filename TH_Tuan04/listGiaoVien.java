/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan04;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class listGiaoVien {

    private ArrayList<giaoVien> dsgv;

    public listGiaoVien() {
        dsgv = new ArrayList<giaoVien>();
    }

    public listGiaoVien(ArrayList<giaoVien> dsgv) {
        this.dsgv = dsgv;
    }

    public void them1GV(giaoVien gv) {
        if (gv instanceof giaoVien) {
            gv.nhap();
            dsgv.add(gv);
        }
    }

    public void xuatDSGiaoVien() {
        for (giaoVien gv : dsgv) {
            gv.xuat();
        }
    }

}
