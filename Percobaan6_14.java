import java.util.Scanner;
public class Percobaan6_14 {
    // fungsi hitungLuas
    static int hitungLuas (int pjg, int lbr) {
        int Luas = pjg*lbr;
        return Luas;
    }
    // fungsi hitungVolume
    static int hitungVolume (int tinggi, int a, int b) {
        int Volume = hitungLuas(a,b)*tinggi;
        return Volume;
    }
    // fungsi main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int p, l, t, L, vol;
        
        System.out.println("Masukkan panjang");
        p = input.nextInt();
        System.out.println("Masukkan lebar");
        l = input.nextInt();
        System.out.println("Masukkan tinggi");
        t = input.nextInt();
        
        L = hitungLuas(p,l);
        System.out.println("Luas persegi panjang adalah "+L);
        
        vol = hitungVolume(t,p,l);
        System.out.println("Volume persegi panjang adalah "+vol);
        
    }
}