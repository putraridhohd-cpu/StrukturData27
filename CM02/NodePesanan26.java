package CM02;

public class NodePesanan26 {
    Pesanan26 pesanan;
    NodePesanan26 prev;
    NodePesanan26 next;

    public NodePesanan26(NodePesanan26 prev, Pesanan26 pesanan, NodePesanan26 next) {
        this.prev = prev;
        this.pesanan = pesanan;
        this.next = next;
    }
}