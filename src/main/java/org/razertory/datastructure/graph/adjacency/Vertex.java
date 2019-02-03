package org.razertory.datastructure.graph.adjacency;

import java.math.BigInteger;

public class Vertex {
    String label;
    Vertex(String label) {
        this.label = label;
    }

    @Override
    public int hashCode() {
        return new BigInteger(this.label.getBytes()).intValue();
    }
}
