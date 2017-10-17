import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Graph {
    private List<Edge> edges;
    private Set<Vertex> vertices;

    public Graph(List<Edge> edges, Set<Vertex> vertices) {
        this.edges = edges;
        this.vertices = vertices;
    }

    public Graph(List<Edge> edges) {
        this.edges = edges;
        for (Edge e: edges) {
            this.vertices.add(e.getA());
            this.vertices.add(e.getB());
        }
    }

    public boolean addEdge (Edge edge) {
        if (!(this.vertices.contains(edge.getA()))&&(this.vertices.contains(edge.getB()))) {
            return false;
        }
        edges.add(edge);
        return true;
    }

    public boolean deleteEdge (Edge edge) {
        return edges.remove(edge);
    }

    public boolean addVertex(Vertex vertex) {
        return vertices.add(vertex);
    }

    public boolean deleteVertex(Vertex vertex) {
        return vertices.remove(vertex);
    }

    public Set<Vertex> getAdjacentVertices(Vertex vertex) {
        List<Edge> connections = this.edges.stream()
            .filter(edge ->(edge.getA().equals(vertex)) || (edge.getB().equals(vertex)))
            .collect(Collectors.toList());
        
        return new HashSet<Vertex>();
    }
}
