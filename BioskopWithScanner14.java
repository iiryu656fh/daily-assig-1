import java.util.Scanner;
public class BioskopWithScanner14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, pilihan;
        String nama, next;
        String[][] penonton = new String[4][2];
        
        while (true) {
            System.out.println("MENU: ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            pilihan = sc.nextInt();
            sc.nextLine();
            
            switch (pilihan) {
                case 1:
                									while (true) {
                									    System.out.println("INPUT DATA PENONTON");
                									    System.out.print("Masukkan nama: ");
                									    nama = sc.nextLine();
                									    
                									    boolean kursi = false;
                									    
                									    do {
                									        System.out.print("Masukkan baris: ");
                									        baris = sc.nextInt();
                									        System.out.print("Masukkan kolom: ");
                									        kolom = sc.nextInt();
                									        sc.nextLine();
                									        
                									        if (baris > penonton.length || kolom > penonton[0].length) {
                									            System.out.println("Nomor baris/kursi tidak tersedia. Masukkan baris dan kolom kembali!");
                									        }
                									        else if (penonton[baris-1][kolom-1] != null) {
                									            System.out.println("Kursi sudah terisi oleh penonton lain. Masukkan Baris dan kolom kembali!");
                									    										} else {
                									    										    kursi = true;
                									    										}
                									    } while (!kursi);
                									        
                									    penonton[baris-1][kolom-1] = nama;
                									    
                									    System.out.print("Input penonton lainnya? (y/n): ");
                									    next = sc.nextLine();
                									    
                									    if (next.equalsIgnoreCase("n")) {
                									        break;
                									    }
             									   }
                break;
                
                case 2:
                System.out.println("#####################################################");
                System.out.println("DAFTAR PENONTON");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[0].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        } else {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                        }
                    }
                }
                break;
                
                case 3:
                System.out.println("#####################################################");
                System.out.println("Terima kasih. Program berakhir.");
                return;
                
                default:
                System.out.println("#####################################################");
                System.out.println("Silahkan pilih menu yang valid.");
            }
            
            System.out.println("#####################################################");
            System.out.print("Kembali ke menu? (y/n): ");
            next = sc.nextLine();
            
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}