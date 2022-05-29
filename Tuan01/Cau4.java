import java.util.Scanner;

public class Cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.print("Mang vua nhap: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

        char[] b = new char[n];
        for (int i = 0; i < n; i++) {
            b[i] = (char) a[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print("\n" + a[i] + " sau khi duoc chuyen la: " + b[i] + " ");
        }
    }
}
