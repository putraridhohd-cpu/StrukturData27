package P1Jobsheet10;

public class Queue26 {
    // Atribut untuk menyimpan data dan status queue
    int[] data;
    int front; // Indeks elemen terdepan
    int rear;  // Indeks elemen paling belakang
    int size;  // Jumlah elemen yang saat ini ada di queue
    int max;   // Kapasitas maksimal queue

    // Konstruktor untuk inisialisasi queue dengan kapasitas n
    public Queue26(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    // Method untuk mengecek apakah queue kosong
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method untuk mengecek apakah queue sudah penuh
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    // Method untuk melihat elemen pada posisi paling depan
    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    // Method untuk menampilkan seluruh elemen dalam queue
    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max; // Perputaran indeks (circular)
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    // Method untuk mengosongkan kembali seluruh isi queue
    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    // Method untuk menambah data baru ke dalam queue (di posisi rear)
    public void Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0; // Kembali ke indeks 0 jika sudah di ujung array (circular)
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    // Method untuk mengeluarkan data dari queue (di posisi front)
    public int Dequeue() {
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0; // Kembali ke indeks 0 jika sudah di ujung array (circular)
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}