import java.util.Scanner;
public class LinearSearch14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array : ");
        int jmlhElemen = sc.nextInt();
        
        int [] arrayInt = new int[jmlhElemen];
        int key;
        int hasil = 0;
        
        for (int i = 0; i < jmlhElemen; i++) {
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();
        
        for (int i = 0; i < jmlhElemen; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        
        if (hasil != 0) {
            System.out.println("Key ada di posisi indeks ke-"+hasil);
        }
        else 
            System.out.println("Key tidak ditemukan");
    }
}