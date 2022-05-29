package Tuan01;
import java.util.Scanner;

public class Cau8 {
    public static void main(String[] args) {
        int[][] a = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Nhap a[%d][%d]: ", i, j);
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }

        System.out.println("Ma tran vua nhap: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.printf("%d\t", a[i][j]);
            System.out.println();
        }
    }
}

