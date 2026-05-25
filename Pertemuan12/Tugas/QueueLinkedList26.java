package Pertemuan12.Tugas;

public class QueueLinkedList26 {
    NodeAntrian26 head; // Menunjuk antrian paling depan (yang akan dipanggil)
    NodeAntrian26 tail; // Menunjuk antrian paling belakang (tempat orang baru masuk)
    int size = 0; // Menyimpan jumlah mahasiswa yang sedang mengantre

    // d. Cek apakah antrian kosong
    public boolean isEmpty() {
        return head == null;
    }

    // d. Cek apakah antrian penuh (karena berbasis Linked List, secara teori memori dinamis/tidak pernah penuh)
    public boolean isFull() {
        return false; 
    }

    // e. Menambahkan antrian baru (Enqueue / addLast)
    public void enqueue(Mahasiswa26 input) {
        NodeAntrian26 ndInput = new NodeAntrian26(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput; // Sambungkan node lama paling belakang ke node baru
            tail = ndInput; // Geser status tail ke node baru
        }
        size++;
        System.out.println(input.nama + " berhasil mendaftar ke dalam antrian.");
    }

    // f. Memanggil antrian paling depan (Dequeue / removeFirst)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Gagal memanggil: Antrian sudah kosong!");
        } else {
            System.out.println("Memanggil antrian terdepan: ");
            head.data.tampilInformasi(); // Panggil mahasiswa terdepan
            head = head.next; // Geser antrian terdepan ke orang di belakangnya
            if (head == null) {
                tail = null; // Jika antrian menjadi kosong, tail juga di-null-kan
            }
            size--;
        }
    }

    // g. Menampilkan antrian terdepan dan antrian paling akhir
    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada data yang bisa di-peek!");
        } else {
            System.out.println("=== STATUS UJUNG ANTRIAN ===");
            System.out.print("[Terdepan] -> ");
            head.data.tampilInformasi();
            System.out.print("[Paling Akhir] -> ");
            tail.data.tampilInformasi();
            System.out.println("=============================");
        }
    }

    // h. Menampilkan jumlah mahasiswa yang masih mengantre beserta seluruh listnya
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian saat ini kosong.");
        } else {
            System.out.println("\n=== DAFTAR MAHASISWA DALAM ANTRIAN (" + size + " Orang) ===");
            NodeAntrian26 tmp = head;
            int no = 1;
            while (tmp != null) {
                System.out.print(no + ". ");
                tmp.data.tampilInformasi();
                tmp = tmp.next;
                no++;
            }
            System.out.println("=========================================================\n");
        }
    }

    // d. Mengosongkan seluruh antrian
    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Semua antrian telah dikosongkan secara paksa!");
    }
}