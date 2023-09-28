import java.util.Scanner;
public class PemilihanPercobaan214 {
    public static void main (String[] args) {
        Scanner input14 = new Scanner(System.in);
        System.out.print("Nilai uas    : ");
        float uas = input14.nextFloat();
        System.out.print("Nilai uts    : ");
        float uts = input14.nextFloat();
        System.out.print("Nilai kuis   : ");
        float kuis = input14.nextFloat();
        System.out.print("Nilai tugas  : ");
        float tugas = input14.nextFloat();
        
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String huruf;
        
        if (total > 80) {
            huruf = "A";
        }
        else if (total > 73) {
            huruf = "B+";
        }
        else if (total > 65) {
            huruf = "B";
        }
        else if (total > 60) {
            huruf = "C+";
        }
        else if (total > 50) {
            huruf = "C";
    										}
        else if (total > 39) {
            huruf = "D";
    									}
        else 
            huruf = "E";
            
        System.out.println("Nilai akhir = " + total + " sehingga mendapatkan predikat nilai " + huruf);
    }
}