package Tuan02;

public class DemoQLCD {
    public static void main(String[] args) {
        DanhSachCD dscd = new DanhSachCD();
        dscd.nhapDSCD();
        dscd.xuatDSCD();
        System.out.print("\n\nDanh sach CD sau khi sap xep");
        dscd.sapXep();
        dscd.xuatDSCD();
    }
}
