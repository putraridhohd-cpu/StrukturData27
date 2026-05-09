package P2Jobsheet10;

public class Mahasiswa26 {
    // Atribut mahasiswa sesuai diagram class
    String nim;
    String nama;
    String prodi;
    String kelas;

    // Konstruktor untuk mengisi data mahasiswa baru
    public Mahasiswa26(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    // Method untuk menampilkan detail data mahasiswa dalam satu baris
    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}