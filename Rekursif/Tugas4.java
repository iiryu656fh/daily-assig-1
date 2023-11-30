import java.util.Scanner;
public class Tugas4 {
    static int hitungFbc(int i) {
        if ( i <= 1) {
            return i;
        } else {
            return (hitungFbc(i-1) + hitungFbc(i-2));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan: ");
        int bulan = sc.nextInt();
        System.out.print("Banyak pasangan yang ada pada bulan ke-"+bulan+" adalah: ");
        System.out.print(hitungFbc(bulan));
    }
}