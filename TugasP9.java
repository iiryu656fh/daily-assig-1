import java.util.Scanner;
public class TugasP9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya elemen: ");
        int bykElemen = sc.nextInt();
        
        int[] bil = new int[bykElemen];
        int rata2, jumlahBil = 0, banyakBil = 0;
        
        for (int i = 0; i < bykElemen; i++) {
            System.out.print("Masukkan bilangan ke-"+(i+1)+": ");
            bil[i] = sc.nextInt();
            jumlahBil += bil[i];
            banyakBil ++;
        }
        
        int max = bil[0];
        int min = bil[0];
        
        for (int i = 0; i < bykElemen; i++) {
            if (bil[i] > max) {
                max = bil[i];
            }
            if (bil[i] < min) {
                min = bil[i];
            }
        }
        
        rata2 = jumlahBil/banyakBil;
        
        System.out.println("Nilai tertinggi adalah: "+max);
        System.out.println("Nilai terendah adalah: "+min);
        System.out.println("Rata-rata keseluruhan bilangan adalah: "+rata2);
    }
}