package CM01;

import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner(System.in);

        // a. Inisialisasi Data Mahasiswa
        Mahasiswa26[] daftarMhs26 = new Mahasiswa26[3];
        daftarMhs26[0] = new Mahasiswa26("22001", "Andi", "Teknik Informatika");
        daftarMhs26[1] = new Mahasiswa26("22002", "Budi", "Teknik Informatika");
        daftarMhs26[2] = new Mahasiswa26("22003", "Citra", "Sistem Informasi Bisnis");

        // b. Inisialisasi Data Buku
        Buku26[] daftarBuku26 = new Buku26[4];
        daftarBuku26[0] = new Buku26("B001", "Algoritma", 2020);
        daftarBuku26[1] = new Buku26("B002", "Basis Data", 2019);
        daftarBuku26[2] = new Buku26("B003", "Pemrograman", 2021);
        daftarBuku26[3] = new Buku26("B004", "Fisika", 2024);

        // c. Inisialisasi Data Peminjaman
        Peminjaman26[] daftarPinjam26 = new Peminjaman26[5];
        daftarPinjam26[0] = new Peminjaman26(daftarMhs26[0], daftarBuku26[0], 7);
        daftarPinjam26[1] = new Peminjaman26(daftarMhs26[1], daftarBuku26[1], 3);
        daftarPinjam26[2] = new Peminjaman26(daftarMhs26[2], daftarBuku26[2], 10);
        daftarPinjam26[3] = new Peminjaman26(daftarMhs26[2], daftarBuku26[3], 6);
        daftarPinjam26[4] = new Peminjaman26(daftarMhs26[0], daftarBuku26[1], 4);

        int menu26;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menu26 = sc26.nextInt();
            System.out.println();

            switch (menu26) {
                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    for (int i = 0; i < daftarMhs26.length; i++) {
                        daftarMhs26[i].tampilMahasiswa();
                    }
                    break;

                case 2:
                    System.out.println("Daftar Buku:");
                    for (int i = 0; i < daftarBuku26.length; i++) {
                        daftarBuku26[i].tampilBuku();
                    }
                    break;

                case 3:
                    System.out.println("Data Peminjaman:");
                    for (int i = 0; i < daftarPinjam26.length; i++) {
                        daftarPinjam26[i].tampilPeminjaman();
                    }
                    break;

                case 4:
                    // Bubble Sort secara Descending (Denda terbesar ke terkecil)
                    for (int i = 0; i < daftarPinjam26.length - 1; i++) {
                        for (int j = 0; j < daftarPinjam26.length - i - 1; j++) {
                            if (daftarPinjam26[j].denda < daftarPinjam26[j + 1].denda) {
                                // Proses pertukaran (Swap)
                                Peminjaman26 temp = daftarPinjam26[j];
                                daftarPinjam26[j] = daftarPinjam26[j + 1];
                                daftarPinjam26[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Setelah diurutkan (Denda terbesar):");
                    for (int i = 0; i < daftarPinjam26.length; i++) {
                        daftarPinjam26[i].tampilPeminjaman();
                    }
                    break;

                case 5:
                    // Sequential Search
                    System.out.print("Masukkan NIM: ");
                    String cariNim26 = sc26.next();
                    boolean ketemu = false;

                    for (int i = 0; i < daftarPinjam26.length; i++) {
                        if (daftarPinjam26[i].mhs.nim.equals(cariNim26)) {
                            daftarPinjam26[i].tampilPeminjaman();
                            ketemu = true;
                        }
                    }

                    if (!ketemu) {
                        System.out.println("Data peminjaman tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (menu26 != 0);
        
        sc26.close();
    }
}