package jobsheet9;

// Bagian B: Class StackTugasMahasiswa
public class StackTugasMahasiswa26 {
    // Nomor 6: Atribut stack, top, dan size
    Mahasiswa26[] stack;
    int top;
    int size;

    // Nomor 7: Konstruktor untuk inisialisasi kapasitas (size) dan index top
    public StackTugasMahasiswa26(int size) {
        this.size = size;
        stack = new Mahasiswa26[size];
        top = -1;
    }

    // Nomor 8: Method untuk mengecek apakah stack penuh
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    // Nomor 9: Method untuk mengecek apakah stack kosong
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    // Nomor 10: Method push untuk menambah tugas ke stack
    public void push(Mahasiswa26 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    // Nomor 11: Method pop untuk mengambil tugas yang akan dinilai
    public Mahasiswa26 pop() {
        if (!isEmpty()) {
            Mahasiswa26 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    // Nomor 12: Method peek untuk melihat tugas paling atas
    public Mahasiswa26 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    // Nomor 13: Method print untuk menampilkan semua daftar tugas di stack
    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    // Tambahan untuk nomor 4: Melihat tugas terbawah (yang pertama dikumpulkan)
    public Mahasiswa26 peekBottom() {
        if (!isEmpty()) {
        return stack[0]; // Indeks 0 adalah data yang paling pertama masuk
        } else {
        System.out.println("Stack kosong!");
        return null;
    }
}

// Tambahan untuk nomor 5: Menghitung jumlah tugas saat ini
    public int count() {
       return top + 1; // Karena top dimulai dari -1, maka jumlah data adalah top + 1
}
}