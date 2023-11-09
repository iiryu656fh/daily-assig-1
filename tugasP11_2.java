import java.util.Scanner;
public class tugasP11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean minimal = true;
        
        while (minimal) {
            System.out.print("Masukkan nilai N(minimal 5): ");
            int N = sc.nextInt();
            
            if (N >= 5) {
                for (int i = 1; i <= N; i++) {
                    for (int j = N; j >= i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            } else {
                System.out.println("Nilai N yang anda masukan kurang dari 5! coba lagi.");
            }
        }
    }
}