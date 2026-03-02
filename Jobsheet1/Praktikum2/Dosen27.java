package Jobsheet1.Praktikum2;

public class Dosen27 {
    // Atribut
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    // Konstruktor Default
    public Dosen27() {
        this.idDosen = "";
        this.nama = "";
        this.statusAktif = false;
        this.tahunBergabung = 0;
        this.bidangKeahlian = "";
    }

    // Konstruktor Berparameter
    public Dosen27(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    // Method untuk menampilkan informasi lengkap
    public void tampilInformasi() {
        System.out.println("ID Dosen         : " + idDosen);
        System.out.println("Nama             : " + nama);
        System.out.println("Status Aktif     : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung  : " + tahunBergabung);
        System.out.println("Bidang Keahlian  : " + bidangKeahlian);
    }

    // Method untuk mengatur status aktif
    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status aktif " + nama + " telah diperbarui.");
    }

    // Method untuk menghitung masa kerja
    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    // Method untuk mengubah bidang keahlian
    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian " + nama + " telah diubah menjadi: " + bidang);
    }
}