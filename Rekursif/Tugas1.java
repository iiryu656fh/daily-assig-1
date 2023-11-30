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
    static int DeretDescendingIteratif (int n) {
        int deret = 0;
        for (int i = n; i >= 0; i--){
            deret = i;
            if (i == 0) {
                System.out.print(deret);
            } else
                System.out.print(deret+", ");
        }
        return deret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bil = sc.nextInt();
        System.out.print("Rekrusif: ");
        System.out.print(DeretDescendingRekursif(bil));
        System.out.println();
        System.out.print("Iteratif: ");
        DeretDescendingIteratif(bil);
    }
}