import java.util.Scanner;
public class Tugas2 {
    static int penjumlahanRekursif(int n, int i) {
        int jumlah = 1;
        if (i >= n) {
            jumlah = n;
            System.out.print(i+" = ");
            return jumlah;
        } else {
            System.out.print(i+"+");
            return (i + penjumlahanRekursif(n, i+1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil, hasil = 1;
        System.out.print("Masukkan bilangan: ");
        bil = sc.nextInt();
        System.out.print("Penjumlah bilangan: ");
        System.out.println(penjumlahanRekursif(bil, hasil));
        
    }
}