package Tuan04;
import java.util.Scanner;

public class HangSanhSu extends HangHoa {
    private String loaiNguyenLieu;

    public HangSanhSu() {
    }

    public HangSanhSu(String maHang, String tenHang, String nhaSanXuat, float gia, String loaiNguyenLieu) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.loaiNguyenLieu = loaiNguyenLieu;
    }

    public String getLoaiNguyenLieu() {
        return loaiNguyenLieu;
    }

    public void setLoaiNguyenLieu(String loaiNguyenLieu) {
        this.loaiNguyenLieu = loaiNguyenLieu;
    }

    @Override
    public void nhapHang() {
        super.nhapHang();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap loai nguyen lieu: ");
        this.loaiNguyenLieu = sc.nextLine();
    }

    @Override
    public void xuatHang() {
        super.xuatHang();
        System.out.printf("%-20s\n", this.loaiNguyenLieu);
    }
}
