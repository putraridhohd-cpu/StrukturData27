package jobsheet9;

public class StackTugasMahasiswa26 {
    Mahasiswa26[] stack;
    int top;
    int size;

    public StackTugasMahasiswa26(int size) {
        this.size = size;
        stack = new Mahasiswa26[size];
        top = -1;
    }

    // Nomor 2: Method baru untuk konversi Desimal ke Biner
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi26 stackKonv = new StackKonversi26();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stackKonv.push(sisa);
            nilai = nilai / 2;
        }
        
        String biner = "";
        while (!stackKonv.isEmpty()) {
            biner += stackKonv.pop();
        }
        return biner;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa26 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

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

    public Mahasiswa26 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    // Method modifikasi sebelumnya: Lihat terbawah
    public Mahasiswa26 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            return null;
        }
    }

    // Method modifikasi sebelumnya: Hitung jumlah
    public int count() {
        return top + 1;
    }

    public void print() {
        // Perbaikan nomor 1: Print dari atas ke bawah (LIFO)
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}