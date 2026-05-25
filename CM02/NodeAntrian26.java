package CM02;

public class NodeAntrian26 {
    int noAntrian;
    Pembeli26 pembeli;
    NodeAntrian26 prev;
    NodeAntrian26 next;

    public NodeAntrian26(NodeAntrian26 prev, int noAntrian, Pembeli26 pembeli, NodeAntrian26 next) {
        this.prev = prev;
        this.noAntrian = noAntrian;
        this.pembeli = pembeli;
        this.next = next;
    }
}