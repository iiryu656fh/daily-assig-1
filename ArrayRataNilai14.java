import java.util.Scanner;
public class ArrayRataNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        
        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0, totalTdkLulus = 0, rata2Lls, rata2Tdk;
        int lulus = 0, tdkLulus = 0;
        
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                lulus++;
            }
            else {
                totalTdkLulus += nilaiMhs[i];
                tdkLulus++;
            }
        }
        
        
        rata2Lls = totalLulus/lulus;
        rata2Tdk = totalTdkLulus/tdkLulus;
        
        System.out.println("Rata-rata nilai lulus = "+rata2Lls);
        System.out.println("Rata-rata nilai tidak lulus "+rata2Tdk);
    }
}