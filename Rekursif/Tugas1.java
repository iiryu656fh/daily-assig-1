import java.util.Scanner;
public class Tugas1 {
    static int DeretDescendingRekursif (int n) {
        if (n == 0) {
            return n;
        } else {
            System.out.print(n+", ");
            return (n * DeretDescendingRekursif(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bil = sc.nextInt();
        System.out.print(DeretDescendingRekursif(bil));
    }
}