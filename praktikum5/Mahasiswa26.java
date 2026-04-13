package praktikum5;

public class Mahasiswa26 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Konstruktor default
    Mahasiswa26() {
    }

    // Konstruktor berparameter
    Mahasiswa26(String nm, String nim, String kls, double ip) {
        nama = nm;
        this.nim = nim;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }
}