package jobsheet9;

// Bagian A: Class Mahasiswa
public class Mahasiswa26 {
    // Nomor 2: Atribut nama, nim, kelas, dan nilai
    String nama, nim, kelas;
    int nilai;

    // Nomor 3: Konstruktor berparameter dengan nilai default -1
    Mahasiswa26(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1;
    }

    // Nomor 4: Method untuk mengeset nilai tugas
    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}

