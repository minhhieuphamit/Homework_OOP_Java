package Tuan06;

import java.util.*;


public class mang {
    protected int[] a;
    protected int n;

    public mang() {
    }

    public mang(int a[], int n) {
        this.n = n;
        this.a = a;
    }

    public void nhapN() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap so phan tu cua mang: ");
                n = sc.nextInt();
                if (n < 0) {
                    System.out.println("So phan tu phai lon hon 0. Nhap lai!");
                } else {
                    break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Vui long nhap so nguyen!");
            }
        }
    }

    public void nhapMang() {
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i < n; i++) {
                System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
                a[i] = sc.nextInt();
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Vui long nhap so nguyen!");
            nhapMang();
        }
    }


    public void xuatMang() {
        System.out.println("\nCac phan tu trong mang: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print("Phan tu thu " + (i + 1) + ": " + a[i] + "\n");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }


    public void layPhanTu() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nNhap vi tri muon lay: ");
            int i = sc.nextInt();
            System.out.println("Phan tu thu " + i + " la: " + a[i - 1]);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Nhap sai dinh dang so!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Vi tri nay khong ton tai!");
        }
    }

    public void themPhanTuVaoViTri() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap phan tu can them: ");
            int x = sc.nextInt();
            System.out.print("Nhap vi tri can them: ");
            int i = sc.nextInt();
            for (int j = n - 1; j >= i; j--) {
                a[j] = a[j - 1];
            }
            a[i - 1] = x;
            n++;
        } catch (java.util.InputMismatchException e) {
            System.out.println("Nhap sai dinh dang so!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Vi tri nay khong ton tai!");
        }
    }


    public void sapXepTangDan() {
        Arrays.sort(a);
        xuatMang();
    }

    public void sapXepGiamDan() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}