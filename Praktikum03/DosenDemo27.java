package Praktikum03;
import java.util.Scanner;

public class DosenDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        Dosen27[] arrayOfDosen = new Dosen27[jumlah];

        // 1. Looping FOR untuk Input Data
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (P/W) : ");
            char jkChar = sc.nextLine().toUpperCase().charAt(0);
            boolean jk = (jkChar == 'P'); // Konversi P jadi true, selain itu false
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("-------------------------------------");

            // Instansiasi objek langsung melalui konstruktor
            arrayOfDosen[i] = new Dosen27(kode, nama, jk, usia);
        }

        // 2. Looping FOREACH untuk Menampilkan Data
        System.out.println("\n===== DAFTAR DOSEN =====");
        int no = 1;
        for (Dosen27 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no++);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("-------------------------------------");
        }
        sc.close();
    }
}
