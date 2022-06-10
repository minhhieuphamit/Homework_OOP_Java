package Tuan04;

public class main_Cau1 {
    public static void main(String[] args) {
        System.out.print("Nhap hang dien may\n");
        HangDienMay hdm = new HangDienMay();
        hdm.nhapHang();
        hdm.xuatHang();

        System.out.print("\nNhap hang sanh su\n");
        HangSanhSu hss = new HangSanhSu();
        hss.nhapHang();
        hss.xuatHang();

        System.out.print("\nNhap hang thuc pham\n");
        HangThucPham htp = new HangThucPham();
        htp.nhapHang();
        htp.xuatHang();
    }
}
