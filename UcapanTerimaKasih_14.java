import java.util.Scanner;
public class UcapanTerimaKasih_14 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda berikan ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the  teacher in the world!\n" 
        +"You inspired in me a love for learning and make me feel like I could ask you anything.");
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}