package praktikum5;

import java.util.Scanner;

public class MahasiswaDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi26 list = new MahasiswaBerprestasi26();
        int jmlMhs = 5;

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
            sc.nextLine(); 
            
            Mahasiswa26 m = new Mahasiswa26(nama, nim, kelas, ipk);
            list.tambah(m);
            System.out.println("-------------------------");
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        // Uji coba Bubble Sort (Descending)
        System.out.println("Data mahasiswa setelah bubble sort (IPK DESC): ");
        list.bubbleSort();
        list.tampil();

        // Uji coba Selection Sort (Ascending) sesuai tugas baru
        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();
        
        sc.close();
    }
}