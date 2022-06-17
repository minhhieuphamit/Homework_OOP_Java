/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan5_bai3;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class listHocVien {
    
    private ArrayList<hocVien> dshv;
    
    public listHocVien(){
        dshv = new ArrayList<hocVien>();
    }
    
    public listHocVien(ArrayList<hocVien> dshv){
        this.dshv = dshv;
    }
    
    public void them1HV(hocVien hv){
        if (hv instanceof hocVien){
            hv.nhap();
            dshv.add(hv);
        }
    }
    
    public void xuatDSHocVien(){
        for (hocVien hv : dshv) {
            hv.xuat();
        }
    }
}
