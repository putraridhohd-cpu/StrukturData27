package Pertemuan12;

public class SLLMain26 {
    public static void main(String[] args) {
        SingleLinkedList26 sll = new SingleLinkedList26();

        // Membuat objek mahasiswa
        Mahasiswa26 mhs1 = new Mahasiswa26("111", "Anton", "1A", 3.5);
        Mahasiswa26 mhs2 = new Mahasiswa26("222", "Budi", "1B", 3.0);
        Mahasiswa26 mhs3 = new Mahasiswa26("333", "Dirga", "1C", 3.8);
        Mahasiswa26 mhs4 = new Mahasiswa26("444", "Eka", "1D", 3.2);

        // Uji coba metode
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}