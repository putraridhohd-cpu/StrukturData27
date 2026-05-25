package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain26 {
    // No. 12: Struktur dasar class main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Disesuaikan dari "scan" di gambar
        DoubleLinkedList26 list = new DoubleLinkedList26();
        int pilihan;

        // No. 13: Perulangan do-while untuk menu pilihan
        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();
            scan.nextLine(); // Membersihkan buffer enter

            // No. 14 & Lanjutan Gambar 3: Switch-case menu program
            switch (pilihan) {
                case 1:
                    Mahasiswa26 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa26 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa26 dataBaru = inputMahasiswa(scan);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);

        scan.close();
    }

    // Fungsi helper tambahan untuk membaca inputan data mahasiswa secara modular
    public static Mahasiswa26 inputMahasiswa(Scanner scan) {
        System.out.print("NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine(); // Membersihkan buffer
        return new Mahasiswa26(nim, nama, kelas, ipk);
    }
}