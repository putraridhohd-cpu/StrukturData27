package CM02;

import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLAntrian26 antrian = new DLLAntrian26();
        DLLPesanan26 pesanan = new DLLPesanan26();

        // Inisialisasi data awal (Sesuai catatan: "gunakan pembuatan object menggunakan konstruktor")
        antrian.enqueue(1, new Pembeli26("Ainra", "08224500000"));
        antrian.enqueue(2, new Pembeli26("Danra", "08224511111"));
        antrian.enqueue(3, new Pembeli26("Sanri", "08224522222"));
        
        int nextNoAntrian = 4; // Counter antrean berikutnya
        int pilihan = -1;

        while (pilihan != 0) {
            System.out.println("========================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = sc.nextLine();
                    
                    Pembeli26 pBaru = new Pembeli26(nama, noHp);
                    antrian.enqueue(nextNoAntrian, pBaru);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nextNoAntrian);
                    nextNoAntrian++; // Increment antrean otomatis
                    break;
                    
                case 2:
                    antrian.printAntrian();
                    break;
                    
                case 3:
                    NodeAntrian26 dilayani = antrian.dequeue();
                    if (dilayani != null) {
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        
                        Pesanan26 pesananBaru = new Pesanan26(kode, namaPesanan, harga);
                        pesanan.addPesanan(pesananBaru);
                        System.out.println(dilayani.pembeli.namaPembeli + " telah memesan " + namaPesanan);
                    }
                    break;
                    
                case 4:
                    pesanan.printLaporan();
                    break;
                    
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem Royal Delish!");
                    break;
                    
                default:
                    System.out.println("Menu tidak valid. Silakan pilih kembali.");
            }
            System.out.println();
        }
        sc.close();
    }
}