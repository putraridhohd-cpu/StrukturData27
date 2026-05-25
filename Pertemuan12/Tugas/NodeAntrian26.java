package Pertemuan12.Tugas;

public class NodeAntrian26 {
    Mahasiswa26 data; // Menyimpan data mahasiswa
    NodeAntrian26 next; // Pointer untuk menyambung ke antrian di belakangnya

    // Konstruktor pembungkus data mahasiswa menjadi sebuah node antrian
    public NodeAntrian26(Mahasiswa26 data, NodeAntrian26 next) {
        this.data = data;
        this.next = next;
    }
}