package CM01;

public class Peminjaman26 {
    Mahasiswa26 mhs;
    Buku26 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    public Peminjaman26(Mahasiswa26 mhs, Buku26 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda(); // Langsung hitung denda saat objek dibuat
    }

    public void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    public void tampilPeminjaman() {
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam +
                " | Terlambat: " + terlambat + " | Denda: " + denda);
    }
}