import java.util.Scanner;
public class EkspedisiJs6 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        double diskon = 0.0, berat, jarak;
        int biaya, jenLay = 0;
        String jenis;
        
        System.out.print("Masukkan jenis layanan yang dipilih (Express, Regular, Standard) : ");
        jenis = input14.nextLine();
        System.out.print("Masukkan berat paket(kg) : ");
        berat = input14.nextDouble();
        System.out.print("Masukkan jarak pengiriman paket (km) : ");
        jarak = input14.nextDouble();
        
        if(jenis.equalsIgnoreCase("express")) {
            jenLay = 500;
            if ((jarak > 10) || (berat > 10)) {
                diskon = 0.2;
                System.out.println("Anda telah mendapat diskon 10%!");
            } else {
                diskon = 0.0;
                System.out.println("Anda tidak mendapatkan diskon 10%");
            }
        } else if(jenis.equalsIgnoreCase("regular")) {
            jenLay = 400;
            if ((jarak > 10) || (berat > 10)) {
                diskon = 0.1;
                System.out.println("Anda telah mendapat diskon 10%!");
            } else {
                diskon = 0.0;
                System.out.println("Anda tidak mendapatkan diskon 10%");
            }
        } else if (jenis.equalsIgnoreCase("standard")) {
            jenLay = 300;
            diskon = 0.0;
            System.out.println("Anda tidak mendapat diskon 10%");
        } else 
            System.out.println("Masukan jenis layanan anda salah");
        
        
        biaya = (int) ((berat * jarak * jenLay) - (berat * jarak * jenLay * diskon));
        System.out.println("Biaya pengiriman paket anda adalah : " + biaya);
    }
}