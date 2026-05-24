package Pertemuan12;

public class SingleLinkedList26 {
    NodeMahasiswa26 head; // Node pertama
    NodeMahasiswa26 tail; // Node terakhir

    // Cek apakah linked list kosong
    public boolean isEmpty() {
        return (head == null);
    }

    // Mencetak isi linked list
    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa26 tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // Menambah data di awal
    public void addFirst(Mahasiswa26 input) {
        NodeMahasiswa26 ndInput = new NodeMahasiswa26(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    // Menambah data di akhir
    public void addLast(Mahasiswa26 input) {
        NodeMahasiswa26 ndInput = new NodeMahasiswa26(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    // Menambah data setelah data tertentu (berdasarkan nama)
    public void insertAfter(String key, Mahasiswa26 input) {
        NodeMahasiswa26 ndInput = new NodeMahasiswa26(input, null);
        NodeMahasiswa26 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    // Menambah data pada indeks tertentu
    public void insertAt(int index, Mahasiswa26 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa26 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa26(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}