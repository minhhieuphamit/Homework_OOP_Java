package Tuan04;

import java.util.*;

public class CDCollection {
    private ArrayList<CD> dscd;
    private int soLuong;

    public CDCollection(){
        dscd = new ArrayList<CD>();
        soLuong = 0;
    }

    public CDCollection(ArrayList<CD> dscd){
        this.dscd = dscd;
        soLuong = dscd.size();
    }

    public void nhapDSCD(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong CD: ");
        soLuong = sc.nextInt();
        for (int i = 0; i < soLuong; i++) {
            System.out.print("\nNhap thong tin CD thu " + (i + 1) + ": ");
            dscd.add(new CD());
            dscd.get(i).nhap();
        }
    }

    public void xuatDSCD(){
        for (CD cd : dscd) {
            cd.xuat();
        }
    }

    public void them1CD(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap thong tin CD moi: ");
        dscd.add(new CD());
        dscd.get(soLuong).nhap();
        soLuong++;
    }

    public void sapXepTheoMaCD(){
        Collections.sort(dscd, new Comparator<CD>() {
            public int compare(CD o1, CD o2) {
                return o1.getMaCD() - o2.getMaCD();
            }
        });
        System.out.println("Danh sach sau khi sap xep theo ma CD: ");
        dscd.forEach(e -> System.out.print(e.toString()));
    }
}
