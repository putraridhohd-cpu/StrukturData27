package P2Jobsheet10;

public class AntrianLayanan26 {
    // Atribut queue yang sekarang menampung array objek Mahasiswa26
    Mahasiswa26[] data;
    int front;
    int rear;
    int size;
    int max;

    // Konstruktor untuk membuat antrean dengan kapasitas tertentu
    public AntrianLayanan26(int max) {
        this.max = max;
        this.data = new Mahasiswa26[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Cek apakah antrean kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // Cek apakah antrean sudah penuh
    public boolean isFull() {
        return size == max;
    }

    // Menambah mahasiswa ke antrean (Enqueue)
    public void tambahAntrian(Mahasiswa26 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
        } else {
            rear = (rear + 1) % max; // Logika circular queue
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian.");
        }
    }

    // Mengeluarkan mahasiswa dari antrean (Dequeue)
    public Mahasiswa26 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } else {
            Mahasiswa26 mhs = data[front];
            front = (front + 1) % max; // Geser front secara circular
            size--;
            return mhs;
        }
    }

    // Melihat mahasiswa yang ada di urutan paling depan (Peek)
    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    // Menampilkan semua mahasiswa yang sedang mengantre
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            // Mengambil indeks dengan benar meskipun antrean melingkar (circular)
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    // Method tambahan untuk mendapatkan jumlah antrean saat ini
    public int getJumlahAntrian() {
        return size;
    }

      // Method baru untuk mengecek antrian yang berada di posisi paling belakang
    public void lihatAkhir() {
        if (isEmpty()) {
           System.out.println("Antrian kosong.");
        } else {
        System.out.println("Mahasiswa paling belakang: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        // Mengambil data pada posisi rear dan memanggil method tampilkanData
        data[rear].tampilkanData();
    }
}

}