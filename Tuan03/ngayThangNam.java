package Tuan03;

import java.util.Scanner;

public class ngayThangNam {
    private int ngay;
    private int thang;
    private int nam;

    public ngayThangNam(){
    }

    public ngayThangNam(int ngay, int thang, int nam){
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public void setNgay(int ngay){
        this.ngay = ngay;
    }

    public void setThang(int thang){
        this.thang = thang;
    }

    public void setNam(int nam){
        this.nam = nam;
    }

    public int getNgay(){
        return this.ngay;
    }

    public int getThang(){
        return this.thang;
    }

    public int getNam(){
        return this.nam;
    }

    public void nhapNgayThang(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap ngay sinh: ");
            this.ngay = sc.nextInt();
            if (this.ngay < 1 || this.ngay > 31){
                System.out.println("Nhap sai ngay sinh, vui long nhap lai!");
            }
        }while (this.ngay < 1 || this.ngay > 31);

        do{
            System.out.print("Nhap thang sinh: ");
            this.thang = sc.nextInt();
            if (this.thang < 1 || this.thang > 12){
                System.out.println("Nhap sai thang sinh, vui long nhap lai!");
            }
        }while (this.thang < 1 || this.thang > 12);

        do{
            System.out.print("Nhap nam sinh: ");
            this.nam = sc.nextInt();
            if (this.nam < 1900 || this.nam > 2020){
                System.out.println("Nhap sai nam sinh, vui long nhap lai!");
            }
        }while (this.nam < 1900 || this.nam > 2022);
    }

    @Override
    public String toString(){
        String ngayThang = "";
        if(this.ngay < 10){
            ngayThang += "0" + this.ngay;
        }
        else{
            ngayThang += this.ngay;
        }
        ngayThang += "/";
        if(this.thang < 10){
            ngayThang += "0" + this.thang;
        }
        else{
            ngayThang += this.thang;
        }
        ngayThang += "/" + this.nam;
        return ngayThang;
    }
}
