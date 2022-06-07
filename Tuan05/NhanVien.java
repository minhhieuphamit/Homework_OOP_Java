package Tuan05;

public abstract class NhanVien {
    protected int maNV, namSinh;
    protected String hoTen, trinhDo, truongDaoTao, chuyenMon;
    protected static double luongCoBan;
    public abstract String getLuong();
    protected abstract void nhap();
    protected abstract void xuat();
}
