public class Edge {
    private Vertex a;
    private Vertex b;

    public Vertex getA() {
        return a;
    }

    public Vertex getB() {
        return b;
    }

    public Edge(Vertex a, Vertex b) {
        this.a = a;
        this.b = b;
    }
}
