import java.util.Scanner;
public class Kubus14 {
    // hitung volume kubus
    static int hitungVolume (int sisi) {
        int volume = sisi*sisi*sisi;
        return volume;
    }
    // hitung luas permukaan kubus
    static int luasPermukaan (int s) {
        int luasP = 6*s*s;
        return luasP;
    }
    // fungsi main
    public static void main(String[]  args) {
        Scanner input = new Scanner(System.in);
        int si2, vol, luas;
        
        System.out.print("Masukkan panjang sisi kubus: ");
        si2 = input.nextInt();
        input.close();
        
        vol = hitungVolume(si2);
        System.out.println("Volume kubus adalah: "+vol);
        luas = luasPermukaan(si2);
        System.out.println("Luas permukaan kubus adalah: "+luas);
    }
}