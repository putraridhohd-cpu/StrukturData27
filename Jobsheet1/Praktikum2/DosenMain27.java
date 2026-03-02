package Jobsheet1.Praktikum2;

public class DosenMain27 {
    public static void main(String[] args) {
        // 1. Instansiasi menggunakan Konstruktor Default
        Dosen27 dsn1 = new Dosen27();
        dsn1.idDosen = "D001";
        dsn1.nama = "Dr. Andi Wijaya";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Kecerdasan Buatan";

        // 2. Instansiasi menggunakan Konstruktor Berparameter
        Dosen27 dsn2 = new Dosen27("D002", "Ir. Shinta Bella", false, 2020, "Rekayasa Perangkat Lunak");

        // Pengujian Objek 1
        System.out.println("=== DATA DOSEN 1 ===");
        dsn1.tampilInformasi();
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2026) + " tahun");
        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("Data Science");
        System.out.println();

        // Pengujian Objek 2
        System.out.println("=== DATA DOSEN 2 ===");
        dsn2.tampilInformasi();
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2026) + " tahun");
        dsn2.setStatusAktif(true);
        
        System.out.println("\n--- Informasi Akhir Dosen 2 ---");
        dsn2.tampilInformasi();
    }
}