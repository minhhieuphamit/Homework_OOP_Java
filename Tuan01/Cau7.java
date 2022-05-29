package Tuan01;
import java.util.Scanner;

public class Cau7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("\nPhan tu lon nhat trong mang: " + max);

    }
}
