package praktikum5;
import java.util.Scanner;

public class MahasiswaDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi26 list = new MahasiswaBerprestasi26();
        int jmlMhs = 5;

        // Proses Input Data secara Dinamis
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // Clear buffer
            
            Mahasiswa26 m = new Mahasiswa26(nama, nim, kelas, ipk);
            list.tambah(m);
            System.out.println("-------------------------");
        }

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("\nData mahasiswa setelah BUBBLE SORT (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData mahasiswa setelah SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("\nData mahasiswa setelah INSERTION SORT (ASC): ");
        list.insertionSort();
        list.tampil();
        
        sc.close();
    }
}