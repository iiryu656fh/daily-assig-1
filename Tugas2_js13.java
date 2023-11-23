import java.util.Scanner;
public class Tugas2_js13 {
    //fungsi main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = input.nextInt();
        
        //input nilai
        int[][] nilai = inputNilai(input, jumlahMahasiswa, jumlahTugas);
        //tampil nilai
        tampilNilai(nilai);
        //cari minggu ke-
        int cariMingguKe = cariMinggu(nilai, jumlahTugas);
        System.out.println("\nNilai tertinggi terdapat pada minggu ke-"+cariMingguKe);
        //cari mahasiswa
        mahasiswaPintar(nilai);
        
    }
    //fungsi input nilai mahasiswa
    static int[][] inputNilai(Scanner input, int jumlahMahasiswa, int jumlahTugas) {
        int[][] nilai = new int[5][7];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai Mahasiswa ke-"+(i+1)+": ");
            for (int j =0; j < jumlahMahasiswa; j++) {
                System.out.print("Masukkan nilai minggu ke-"+(j+1)+": ");
                nilai[i][j] = input.nextInt();
            }
        }
        return nilai;
    }
    //fungsi tampilkan array nilai mahasiswa
    static void tampilNilai (int[][] nilai) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai mahasiswa ke-"+(i+1)+": ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j]+": ");
            }
            System.out.println();
        }
    }
    //fungsi Cari minggu keberapa terdapat nilai tertinggi
    static int cariMinggu (int[][] nilai, int jumlahTugas){
        int N = 0, M = 0;
        for (int i = 0; i < jumlahTugas; i++) {
            int temp = 0;
            for(int j = 0; j < nilai.length; j++) {
                temp += nilai[j][i];
            }
            if (temp > N) {
                N = temp;
                M = i+1;
            }
        }
        return M;
    }
    //fungsi Menampilkan mahasiswa dengan nilai tertinggi(minggu ke-)
    static void mahasiswaPintar(int[][] nilai) {
        int N = 0, Mhs = 0, Mg = 0;
        for (int i = 0; i < nilai.length; i++) {
            for(int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > N) {
                    N = nilai [i][j];
                    Mhs = i + 1;
                    Mg = j + 1;
                }
            }
        }
        System.out.println("Mahasiswa yang mendaoatkan nilai tertinggi adalah mahasiswa ke-"+Mhs+" di minggu ke-"+Mg);
    }
}