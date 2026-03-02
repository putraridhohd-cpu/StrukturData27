package Jobsheet1.Praktikum1;

public class MataKuliah {
    // Atribut
    public String kodeMK;
    public String nama;
    public int sks;
    public int jumlahJam;

    // Konstruktor Default
    public MataKuliah() {
        this.kodeMK = "";
        this.nama = "";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    // Konstruktor Berparameter
    public MataKuliah(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Method untuk menampilkan informasi
    public void tampilInformasi() {
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("---------------------------");
    }

    // Method untuk mengubah SKS
    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS untuk mata kuliah " + nama + " telah diubah menjadi: " + sksBaru);
    }

    // Method untuk menambah jumlah jam
    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam ditambahkan. Total jam sekarang: " + this.jumlahJam);
    }

    // Method untuk mengurangi jumlah jam
    public void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Pengurangan berhasil. Sisa jumlah jam: " + this.jumlahJam);
        } else {
            System.out.println("Gagal mengurangi! Jumlah jam tidak mencukupi (Sisa jam: " + this.jumlahJam + ")");
        }
    }
}
