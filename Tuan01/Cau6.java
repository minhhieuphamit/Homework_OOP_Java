package Tuan01;
import java.util.Random;

public class Cau6 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("\nTong mang la: " + sum);
    }
}
