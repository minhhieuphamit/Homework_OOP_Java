package Tuan02;

public class DemoQLHS {
    public static void main(String[] args) {
        DSHocSinh ds = new DSHocSinh();
        ds.nhapDS();
        ds.xuatDS();
        ds.sapXep();
        System.out.print("\nDanh sach sau khi sap xep");
        ds.xuatDS();
        System.out.print("\nNhap ten can tim de thay doi: ");
        String ten = new java.util.Scanner(System.in).nextLine();
        ds.doiTenHS(ten);
        ds.xuatDS();
        System.out.print("\nNhap thong tin hoc sinh can them: ");
        ds.themHS();
        ds.xuatDS();
    }
}
