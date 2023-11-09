import java.util.Scanner;
public class NesteedLoop_2341720057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];
        
        for (int i = 0; i < temps.length; i++) {
            double totalTemps = 0;
            System.out.println("Kota ke-"+(i+1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-"+(j+1)+": ");
                temps[i][j] = scanner.nextDouble();
                totalTemps += temps[i][j];
            }
            System.out.println();
            double rata2 = totalTemps / temps[i].length;
            System.out.println("Rata-rata suhu kota ke-"+(i+1)+": "+rata2);
            System.out.println();
        }
    }
}