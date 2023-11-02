import java.util.Scanner;

public class TgsP92 {
    public static void main(String[] args) {

        String clearScreen = ("\033[H\033[2J");
        System.out.println(clearScreen);
        
        // TODO: transaksi

        String [] identitas = new String[11];
    
        Scanner transaksi = new Scanner(System.in);

        while (true) {
            
            // input data pengirim
            System.out.print("Nama Pengirim : ");
            identitas[0] = transaksi.nextLine();
            System.out.print("Alamat Pengirim : ");
            identitas[1] = transaksi.nextLine();
            System.out.print("No. Handphone : ");
            identitas[2] = transaksi.nextLine();
        
            System.out.println(clearScreen);
        
            // input data penerima
            System.out.print("Nama Penerima : ");
            identitas[3] = transaksi.nextLine();
            System.out.print("Alamat Penerima : ");
            identitas[4] = transaksi.nextLine();
            System.out.print("Kecamatan : ");
            identitas[5] = transaksi.nextLine();
            System.out.print("Kota/Kabupaten : ");
            identitas[6] = transaksi.nextLine();
            System.out.print("Provinsi : ");
            identitas[7] = transaksi.nextLine();
            System.out.print("Kode Pos : ");
            identitas[8] = transaksi.nextLine();
            System.out.print("No. Handphone : ");
            identitas[9] = transaksi.nextLine();
            System.out.print("Tanggal Kirim : ");
            identitas[10] = transaksi.nextLine();
            
            System.out.print(clearScreen);
            for (String i : identitas) {
                System.out.println(i);  
            }
            
            System.out.print("apakah anda ingin memasukan data lain (y/n) : ");
            String jawaban = transaksi.next();
            if (jawaban.equals("n")) {
                break;
            }
            System.out.println(clearScreen);
            transaksi.nextLine();
        }
        
    }
}