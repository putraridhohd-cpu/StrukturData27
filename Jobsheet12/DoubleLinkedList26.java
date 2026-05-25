package Jobsheet12;

public class DoubleLinkedList26 {
    // No. 5: Deklarasi atribut head dan tail
    Node26 head;
    Node26 tail;

    // No. 6: Konstruktor DoubleLinkedList
    public DoubleLinkedList26() {
        head = null;
        tail = null;
    }

    // No. 7: Method isEmpty()
    public boolean isEmpty() {
        return head == null;
    }

    // No. 8: Method addFirst()
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

    // No. 9: Method addLast()
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

    // No. 10: Method insertAfter()
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

        // Jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { // Node baru disisipkan di tengah
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    // No. 11: Method print() untuk traversal dari head ke tail
    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node26 current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("-------------------------"); // Pembatas biar rapi saat diprint
            current = current.next;
        }
    }

    // Tambahan: Method removeFirst() dan removeLast() untuk mendukung Case 4 dan Case 5 di Main
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