import java.util.Scanner;
public class tugasP11_No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean minimal = true;
        
        while(minimal) {
            System.out.print("Masukkan nilai N(minimal 3): ");
            int N = sc.nextInt();
            
            if ( N >= 3) {
                for (int i = 1; i <= N; i++) {
                    for (int j = N; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print(k);
                    }
                    System.out.println();
                }
                break;
            } else {
                System.out.println("Masukan nilai N kurang dari 3! Coba lagi.");
            }
        }
    }
}