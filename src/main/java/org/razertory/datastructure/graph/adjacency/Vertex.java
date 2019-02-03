package org.razertory.datastructure.graph.adjacency;

import java.util.Objects;

public class Vertex {
    String label;
    Vertex(String label) {
        this.label = label;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.label);
    }
}
