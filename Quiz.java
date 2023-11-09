import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
            
        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                
                if (answer < number) {
                    System.out.print("Tebakkan anda lebih kecil dari jawaban, silakan coba lagi.");
                }
                else if (answer > number) {
                    System.out.print("Tebakan anda lebih besar dari jawaban, silakan coba lagi.");
                }
                else {
                    success = (answer == number);
                    System.out.println("Benar!");
                }
            } while (!success);
            System.out.print("Apakah anda ingin mengulang permainan? (y/Y): ");
            menu = input.nextLine().charAt(0);
        } while ( menu == 'y' || menu == 'Y');
    }
}