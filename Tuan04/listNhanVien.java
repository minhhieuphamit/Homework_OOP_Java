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
public class listNhanVien {
    
    private ArrayList<nhanVien> dsnv;
    
    public listNhanVien(){
        dsnv = new ArrayList<nhanVien>();
    }
    
    public listNhanVien(ArrayList<nhanVien> dsnv){
        this.dsnv = dsnv;
    }
    
    public void them1NV(nhanVien nv){
        if (nv instanceof nhanVien){
            nv.nhap();
            dsnv.add(nv);
        }
    }
    
    public void xuatDSNhanVien(){
        for (nhanVien nv : dsnv) {
            nv.xuat();
        }
    }
}
