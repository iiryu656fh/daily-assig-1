import java.util.Scanner;
public class Tugas3 {
    static boolean cekPrimaRekursif(int n, int i) {
        if (i < 2) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return (cekPrimaRekursif(n, i-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bil = sc.nextInt();
        
        if (bil < 2) {
            System.out.print("Bilangan " +bil+ " bukan bilangan prima");
        } else if (cekPrimaRekursif(bil, bil-1)) {
            System.out.print("Bilangan " +bil+ " adalah bilangan prima");
        } else {
            System.out.print("Bilangan " +bil+ " bukan bilangan prima");
        }
    }
}