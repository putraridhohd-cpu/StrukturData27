package jobsheet9.Latihan_Praktikum;

public class StackSurat26 {
    Surat26[] data;
    int size;
    int top;

    public StackSurat26(int size) {
        this.size = size;
        data = new Surat26[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat26 srt) {
        if (!isFull()) {
            top++;
            data[top] = srt;
            System.out.println("Surat berhasil diterima.");
        } else {
            System.out.println("Gagal! Antrean surat penuh.");
        }
    }

    public Surat26 pop() {
        if (!isEmpty()) {
            Surat26 srt = data[top];
            top--;
            return srt;
        } else {
            System.out.println("Tidak ada surat yang bisa diproses.");
            return null;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Surat Terakhir: " + data[top].idSurat + " atas nama " + data[top].namaMahasiswa);
        } else {
            System.out.println("Stack kosong.");
        }
    }

    // Fitur Tambahan: Cari Surat berdasarkan Nama
    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan pada tumpukan ke-" + (top - i + 1));
                System.out.println("ID: " + data[i].idSurat + " | Durasi: " + data[i].durasi + " hari");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}