package Pertemuan12;

public class SLLMain26 {
    public static void main(String[] args) {
        SingleLinkedList26 sll = new SingleLinkedList26();

        Mahasiswa26 mhs1 = new Mahasiswa26("111", "Anton", "1A", 3.5);
        Mahasiswa26 mhs2 = new Mahasiswa26("222", "Budi", "1B", 3.0);
        Mahasiswa26 mhs3 = new Mahasiswa26("333", "Dirga", "1C", 3.8);
        Mahasiswa26 mhs4 = new Mahasiswa26("444", "Eka", "1D", 3.2);
        Mahasiswa26 mhsBimon = new Mahasiswa26("555", "Bimon", "1E", 3.9);

        // Menambahkan data agar list tidak kosong
        sll.addFirst(mhs1);
        sll.addLast(mhs4);
        sll.addLast(mhs3);
        sll.addLast(mhsBimon);
        sll.print();

        // Uji coba method baru
        System.out.println("Data index 1 : ");
        sll.getData(1);

        System.out.println("Data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }
}