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

    // Modifikasi removeFirst: Menampilkan data yang dihapus
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        
        System.out.println("Data yang dihapus: ");
        head.data.tampil(); // Menampilkan data sebelum dihapus

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Modifikasi removeLast: Menampilkan data yang dihapus
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        
        System.out.println("Data yang dihapus: ");
        tail.data.tampil(); // Menampilkan data sebelum dihapus

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
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
}