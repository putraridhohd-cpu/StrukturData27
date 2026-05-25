package CM02;

public class DLLAntrian26 {
    NodeAntrian26 head;
    NodeAntrian26 tail;
    int size;

    public DLLAntrian26() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Menambah antrean (berjalan di belakang / tail)
    public void enqueue(int noAntrian, Pembeli26 pembeli) {
        if (isEmpty()) {
            head = tail = new NodeAntrian26(null, noAntrian, pembeli, null);
        } else {
            NodeAntrian26 newNode = new NodeAntrian26(tail, noAntrian, pembeli, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Menghapus antrean (dipanggil dari depan / head)
    public NodeAntrian26 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return null;
        }
        NodeAntrian26 temp = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return temp;
    }

    // Mencetak seluruh antrean
    public void printAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("=========================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=========================================");
        System.out.printf("%-15s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        NodeAntrian26 current = head;
        while (current != null) {
            System.out.printf("%-15d %-15s %-15s\n", current.noAntrian, current.pembeli.namaPembeli, current.pembeli.noHp);
            current = current.next;
        }
    }
}