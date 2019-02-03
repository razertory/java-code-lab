package org.razertory.datastructure.graph.adjacency;

public class Vertex {
    String label;
    Vertex(String label) {
        this.label = label;
    }

    @Override
    public int hashCode() {
        return this.label.hashCode();
    }

    @Override
    public boolean equals(Object vertex) {
        return vertex != null && this.hashCode() == vertex.hashCode();
    }
}
