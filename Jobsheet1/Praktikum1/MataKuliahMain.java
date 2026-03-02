package Jobsheet1.Praktikum1;

public class MataKuliahMain {
    public static void main(String[] args) {
        // 1. Instansiasi menggunakan Konstruktor Default
        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "IF101";
        mk1.nama = "Dasar Pemrograman";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        // 2. Instansiasi menggunakan Konstruktor Berparameter
        MataKuliah mk2 = new MataKuliah("IF202", "Struktur Data", 4, 6);

        // Pengujian Objek 1
        System.out.println("=== Informasi Mata Kuliah 1 ===");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        System.out.println();

        // Pengujian Objek 2
        System.out.println("=== Informasi Mata Kuliah 2 ===");
        mk2.tampilInformasi();
        mk2.tambahJam(2);
        
        // Contoh kasus pengurangan yang gagal
        System.out.println("Mencoba mengurangi 10 jam...");
        mk2.kurangiJam(10); 
        
        System.out.println("\nInformasi Akhir MK 2:");
        mk2.tampilInformasi();
    }
}