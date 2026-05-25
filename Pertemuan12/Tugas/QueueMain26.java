package Pertemuan12.Tugas;

public class QueueMain26 {
    public static void main(String[] args) {
        QueueLinkedList26 antrianUnit = new QueueLinkedList26();

        // c. Data mahasiswa yang akan mendaftar antrian
        Mahasiswa26 mhs1 = new Mahasiswa26("111", "Anton", "1A", 3.5);
        Mahasiswa26 mhs2 = new Mahasiswa26("222", "Budi", "1B", 3.0);
        Mahasiswa26 mhs3 = new Mahasiswa26("333", "Dirga", "1C", 3.8);
        Mahasiswa26 mhs4 = new Mahasiswa26("444", "Eka", "1D", 3.2);

        System.out.println("--- UJI COBA ANTRIAN KEMAHASISWAAN ---\n");

        // Cek kondisi awal antrian
        System.out.println("Apakah antrian kosong? " + antrianUnit.isEmpty());
        
        // e. Menambahkan mahasiswa ke antrian
        antrianUnit.enqueue(mhs1);
        antrianUnit.enqueue(mhs2);
        antrianUnit.enqueue(mhs3);
        
        // h. Menampilkan kondisi antrian saat ini
        antrianUnit.displayQueue();

        // g. Menampilkan ujung depan dan belakang antrian
        antrianUnit.peek();
        System.out.println();

        // f. Memanggil/mengurangi antrian (Dequeue)
        antrianUnit.dequeue();
        
        // Menampilkan antrian setelah dipanggil satu orang
        antrianUnit.displayQueue();

        // Tambah orang baru di posisi paling belakang
        antrianUnit.enqueue(mhs4);
        antrianUnit.displayQueue();
        
        // d. Mengosongkan antrian
        antrianUnit.clear();
        antrianUnit.displayQueue();
    }
}