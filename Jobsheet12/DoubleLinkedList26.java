package Jobsheet12;

public class DoubleLinkedList26 {
    Node26 head;
    Node26 tail;

    public DoubleLinkedList26() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa26 data) {
        Node26 newNode = new Node26(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa26 data) {
        Node26 newNode = new Node26(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa26 data) {
        Node26 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node26 newNode = new Node26(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    // No. 5: Memastikan menampilkan pesan ketika linked list masih kosong
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node26 current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("-------------------------");
            current = current.next;
        }
    }

    // No. 6: Menambahkan method printReverse() untuk cetak data terbalik dari tail ke head
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node26 current = tail;
        while (current != null) {
            current.data.tampil();
            System.out.println("-------------------------");
            current = current.prev; // Berjalan mundur memanfaatkan pointer prev
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak ada yang bisa dihapus.");
        } else if (head == tail) {
            head = tail = null;
            System.out.println("Data pertama berhasil dihapus. List sekarang kosong.");
        } else {
            head = head.next;
            head.prev = null;
            System.out.println("Data pertama berhasil dihapus.");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak ada yang bisa dihapus.");
        } else if (head == tail) {
            head = tail = null;
            System.out.println("Data terakhir berhasil dihapus. List sekarang kosong.");
        } else {
            tail = tail.prev;
            tail.next = null;
            System.out.println("Data terakhir berhasil dihapus.");
        }
    }
}