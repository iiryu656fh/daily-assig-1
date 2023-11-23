import java.util.Scanner;
public class tugasP11_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean minimal = true;
        
        while (minimal) {
            System.out.print("Masukkan nilai N(minimal 3): ");
            int N = sc.nextInt();
            
            if (N >= 3) {
                for (int i = 1; i <= N; i++) {
                    for (int j = 1; j <= N; j++) {
                        if (i == 1 || i == N || j == 1 || j == N) {
                            System.out.print(N);
                        } else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            } else {
                System.out.println("Nilai N yang anda masukkan kurang dari 3! Coba lagi.");
            }
        }
    }
}