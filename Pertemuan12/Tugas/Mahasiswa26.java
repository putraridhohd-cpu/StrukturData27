package Pertemuan12.Tugas;

public class Mahasiswa26 {
    String nim, nama, kelas;
    double ipk;

    // Konstruktor untuk membuat objek mahasiswa baru yang akan mengantri
    public Mahasiswa26(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    // Menampilkan informasi detail mahasiswa yang ada di antrian
    public void tampilInformasi() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
    }
}