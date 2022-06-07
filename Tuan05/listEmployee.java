package Tuan05;

import java.util.Scanner;
import java.util.ArrayList;

public class listEmployee {
    private ArrayList<NhanVien> nv;
    private ArrayList<nhanVienQuanLy> nvQL;
    private ArrayList<nhanVienNghienCuu> nvNC;
    private ArrayList<nhanVienPhucVu> nvPV;

    public listEmployee() {
        nv = new ArrayList<NhanVien>();
        nvQL = new ArrayList<nhanVienQuanLy>();
        nvNC = new ArrayList<nhanVienNghienCuu>();
        nvPV = new ArrayList<nhanVienPhucVu>();
    }

    public listEmployee(ArrayList<NhanVien> nv, ArrayList<nhanVienQuanLy> nvQL, ArrayList<nhanVienNghienCuu> nvNC, ArrayList<nhanVienPhucVu> nvPV) {
        this.nv = nv;
        this.nvQL = nvQL;
        this.nvNC = nvNC;
        this.nvPV = nvPV;
    }

    public void them(NhanVien nv){
        if (nv instanceof nhanVienQuanLy){
            nvQL.add((nhanVienQuanLy) nv);
        }
        else if (nv instanceof nhanVienNghienCuu){
            nvNC.add((nhanVienNghienCuu) nv);
        }
        else if (nv instanceof nhanVienPhucVu){
            nvPV.add((nhanVienPhucVu) nv);
        }
    }

    public void xuatDS() {
        for (nhanVienQuanLy nv : nvQL) {
            nv.xuat();
        }
        for (nhanVienNghienCuu nv : nvNC) {
            nv.xuat();
        }
        for (nhanVienPhucVu nv : nvPV) {
            nv.xuat();
        }
    }

    public void xuatLuong() {
        for (nhanVienQuanLy nv : nvQL) {
            System.out.println(nv.getLuong());
        }
        for (nhanVienNghienCuu nv : nvNC) {
            System.out.println(nv.getLuong());
        }
        for (nhanVienPhucVu nv : nvPV) {
            System.out.println(nv.getLuong());
        }
    }
}
