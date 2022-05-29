package Tuan01;

public class Cau5 {
    public static void main(String[] args) {
        long a = 1;
        long b = 1;
        long c = 0;
        //nhap n
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 3; i < 100; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
