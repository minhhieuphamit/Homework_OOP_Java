package Tuan04;
import java.util.Scanner;

public class HangThucPham extends HangHoa {
    private ngayThangNam ngaySanXuat, ngayHetHan;

    public HangThucPham() {
    }

    public HangThucPham(String maHang, String tenHang, String nhaSanXuat, float gia, ngayThangNam ngaySanXuat, ngayThangNam ngayHetHan) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public ngayThangNam getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(ngayThangNam ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public ngayThangNam getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(ngayThangNam ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public void nhapHang() {
        super.nhapHang();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay san xuat: ");
        this.ngaySanXuat = new ngayThangNam();
        this.ngaySanXuat.nhapNgayThang();
        System.out.print("\nNhap ngay het han: ");
        this.ngayHetHan = new ngayThangNam();
        this.ngayHetHan.nhapNgayThang();
    }

    @Override
    public void xuatHang() {
        super.xuatHang();
        System.out.printf("%-20s%-20s", this.ngaySanXuat.toString(), this.ngayHetHan.toString());
    }

}
