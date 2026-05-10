package Tugas10;

import java.util.Scanner;

public class MainKRS26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntreanKRS26 krs = new AntreanKRS26(10); // Kapasitas antrean 10
        int pilih;

        do {
            System.out.println("\n--- Sistem Antrean KRS DPA ---");
            System.out.println("1. Tambah Antrean Mahasiswa");
            System.out.println("2. Panggil 2 Mahasiswa (Proses KRS)");
            System.out.println("3. Lihat Semua Antrean");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Paling Akhir");
            System.out.println("6. Cetak Status & Jumlah");
            System.out.println("7. Kosongkan Antrean");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    krs.tambahMahasiswa(new Mahasiswa26(nim, nama, prodi, kelas));
                    break;
                case 2: krs.panggilProsesKRS(); break;
                case 3: krs.tampilkanSemua(); break;
                case 4: krs.tampilkan2Terdepan(); break;
                case 5: krs.tampilkanAkhir(); break;
                case 6: krs.cetakStatus(); break;
                case 7: krs.kosongkan(); break;
            }
        } while (pilih != 0);
    }
}