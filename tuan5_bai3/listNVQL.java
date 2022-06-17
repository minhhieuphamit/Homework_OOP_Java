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
public class listNVQL {

    private ArrayList<nhanVienQL> dsnvql;

    public listNVQL() {
        dsnvql = new ArrayList<nhanVienQL>();
    }

    public listNVQL(ArrayList<nhanVienQL> dsnvql) {
        this.dsnvql = dsnvql;
    }

    public void them1NV(nhanVienQL nvql) {
        if (nvql instanceof nhanVienQL) {
            nvql.nhap();
            dsnvql.add(nvql);
        }
    }

    public void xuatDSNhanVienQL() {
        for (nhanVienQL nv : dsnvql) {
            nv.xuat();
        }
    }
}
