package jobsheet9.Latihan_Praktikum;

public class Surat26 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin; // S: Sakit, I: Izin
    int durasi;

    // Konstruktor Default
    public Surat26() {
    }

    // Konstruktor Berparameter
    public Surat26(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}