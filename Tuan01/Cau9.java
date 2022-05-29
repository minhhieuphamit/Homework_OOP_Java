package Tuan01;
import java.util.Scanner;

public class Cau9 {
    public static void main(String[] args) {
        int soDong, soCot;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dong: ");
        soDong = sc.nextInt();
        System.out.print("Nhap so cot: ");
        soCot = sc.nextInt();
        int[][] a = new int[soDong][soCot];

        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhap a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ma tran vua nhap: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        System.out.print("Nhap dong can tinh tong: ");
        int dongCanTinh = sc.nextInt();
        for (int i = 0; i < soCot; i++) {
            sum += a[dongCanTinh - 1][i];
        }
        System.out.println("Tong cua dong " + dongCanTinh + " la: " + sum);
    }
}
