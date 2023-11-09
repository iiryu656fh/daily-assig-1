import java.util.Scanner;
public class tugasP11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N(minimal 5): ");
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            for (int j = N; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}