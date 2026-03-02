package Jobsheet1;

public class Mahasiswa27 {

    // ✅ Atribut (harus di luar konstruktor)
    String nama;
    String NIM;
    String kelas;
    double ipk;

    // ✅ Konstruktor Default
    public Mahasiswa27() {

    }

    // ✅ Konstruktor Berparameter
    public Mahasiswa27(String nm, String nim, String kls, double ipk) {
        this.nama = nm;
        this.NIM = nim;
        this.kelas = kls;
        this.ipk = ipk;
    }

    // ✅ Method
    void TampilkanInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
        System.out.println("Nilai Kerja : " + nilaiKerja());
    }

    void ubahkelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
            System.out.println("IPK berhasil diperbarui.");
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}