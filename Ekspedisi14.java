import java.util.Scanner;
public class Ekspedisi14 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        
        System.out.print("Masukkan berat paket (kg): ");
        double beratPaket = input14.nextDouble();
        System.out.print("Masukkan jarak pengiriman(km): ");
        double jarakPengiriman = input14.nextDouble();
        System.out.print("Masukkan jenis layanan (express/regular/standard): ");
        String jenisLayanan = input14.next();
        
        double biayaPengiriman,layanan = 0.0;
        
        switch (jenisLayanan) {
            case "express" :
                layanan = 0.2;
                break;
            case "regular":
                layanan = 0.1;
                break;
            case "standard":
                layanan = 0.05;
                break;
            default:
                System.out.println("Maaf, jenis layanan tidak valid");
            
        }
        
        biayaPengiriman = beratPaket*jarakPengiriman*layanan*1000;
        
        System.out.println("Biaya pengiriman : Rp" +biayaPengiriman);
    }
}