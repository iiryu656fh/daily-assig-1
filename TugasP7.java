import java.util.Scanner;
public class TugasP7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int banyakPengiriman = 0;
        double disc = 0, biaya = 0, biayaTotal = 0;
        
        do {
            System.out.print("Berapa kali anda sudah mengirim paket di ekspedisi kami? ");
            banyakPengiriman = sc.nextInt();
            System.out.print("Masukkan biaya ongkos kirim yang sudah dihitung sebelumnya: ");
            biaya = sc.nextInt();
        
                if (banyakPengiriman % 5 == 0) {
                disc = 0.05;
                
                }
            biayaTotal = biaya - biaya*disc;
            System.out.println("Total biaya ongkos kirim anda adalah: " +biayaTotal );


            System.out.print("ingin menambahkan inputan baru? (y/t)");
            String konfirmasi = sc.next();
                if (konfirmasi.equals("t")) {
                    break;
                }
            
        }while(banyakPengiriman != 0);
    }
}