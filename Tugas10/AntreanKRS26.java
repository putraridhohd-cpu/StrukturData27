package Tugas10;

public class AntreanKRS26 {
    Mahasiswa26[] antrean;
    int front, rear, size, max;
    int jumlahSelesaiKRS = 0; // Menghitung mahasiswa yang sudah diproses
    int totalKapasitasDPA = 30; // Batas total mahasiswa per DPA

    public AntreanKRS26(int n) {
        max = n;
        antrean = new Mahasiswa26[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() { return size == 0; }
    public boolean isFull() { return size == max; }

    public void tambahMahasiswa(Mahasiswa26 mhs) {
        if (isFull()) {
            System.out.println("Antrean penuh! Tidak bisa menambah lagi.");
        } else {
            rear = (rear + 1) % max;
            antrean[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk antrean.");
        }
    }

    // Memanggil 2 mahasiswa sekaligus untuk proses KRS
    public void panggilProsesKRS() {
        if (size < 2) {
            System.out.println("Gagal panggil: Mahasiswa di antrean kurang dari 2 orang!");
        } else {
            System.out.println("Memproses KRS untuk 2 mahasiswa:");
            for (int i = 0; i < 2; i++) {
                Mahasiswa26 m = antrean[front];
                System.out.print("Selesai: ");
                m.tampilkanData();
                front = (front + 1) % max;
                size--;
                jumlahSelesaiKRS++;
            }
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
        } else {
            for (int i = 0; i < size; i++) {
                antrean[(front + i) % max].tampilkanData();
            }
        }
    }

    public void tampilkan2Terdepan() {
        if (size < 2) {
            System.out.println("Mahasiswa di antrean kurang dari 2.");
        } else {
            System.out.println("2 Antrean terdepan:");
            antrean[front].tampilkanData();
            antrean[(front + 1) % max].tampilkanData();
        }
    }

    public void tampilkanAkhir() {
        if (isEmpty()) System.out.println("Kosong.");
        else antrean[rear].tampilkanData();
    }

    public void cetakStatus() {
        System.out.println("Jumlah di antrean: " + size);
        System.out.println("Sudah selesai KRS: " + jumlahSelesaiKRS);
        System.out.println("Sisa kuota DPA (Belum KRS): " + (totalKapasitasDPA - jumlahSelesaiKRS));
    }

    public void kosongkan() {
        front = 0; rear = -1; size = 0;
        System.out.println("Antrean dikosongkan!");
    }
}