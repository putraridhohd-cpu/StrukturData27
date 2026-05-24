package Pertemuan12;

public class Mahasiswa26 {
    String nim, nama, kelas;
    double ipk;

    // Konstruktor kosong
    public Mahasiswa26() {
    }

    // Konstruktor dengan parameter
    public Mahasiswa26(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilInformasi() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
    }
}