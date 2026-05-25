package CM02;

public class DLLPesanan26 {
    NodePesanan26 head;
    NodePesanan26 tail;
    int size;

    public DLLPesanan26() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Tambah data pesanan baru
    public void addPesanan(Pesanan26 pesanan) {
        if (isEmpty()) {
            head = tail = new NodePesanan26(null, pesanan, null);
        } else {
            NodePesanan26 newNode = new NodePesanan26(tail, pesanan, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Sorting pesanan berdasarkan Nama Pesanan (Alfabetis) menggunakan Bubble Sort
    public void sortPesanan() {
        if (isEmpty() || head.next == null) return;
        boolean swapped;
        do {
            swapped = false;
            NodePesanan26 current = head;
            while (current.next != null) {
                if (current.pesanan.namaPesanan.compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {
                    Pesanan26 temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    // Mencetak laporan dan total pendapatan
    public void printLaporan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan yang masuk.");
            return;
        }
        sortPesanan(); // Panggil sorting sebelum cetak
        System.out.println("=========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("=========================================");
        System.out.printf("%-15s %-20s %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        
        NodePesanan26 current = head;
        long totalPendapatan = 0;
        
        while (current != null) {
            System.out.printf("%-15d %-20s %-10d\n", current.pesanan.kodePesanan, current.pesanan.namaPesanan, current.pesanan.harga);
            totalPendapatan += current.pesanan.harga;
            current = current.next;
        }
        System.out.println("=========================================");
        System.out.println("Total Pendapatan : Rp " + totalPendapatan);
    }
}