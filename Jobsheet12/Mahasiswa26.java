package Jobsheet12;

public class Mahasiswa26 {
    String nim;
    String name; // Mengikuti variabel di gambar: nama
    String nama; 
    String kelas;
    double ipk;

    // Konstruktor untuk menginisialisasi seluruh atribut
    public Mahasiswa26(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    // Method untuk menampilkan data mahasiswa
    public void tampil() {
        System.out.println(
            "NIM   : " + nim +
            "\nNama  : " + nama +
            "\nKelas : " + kelas +
            "\nIPK   : " + ipk
        );
    }
}