package org.razertory.javacodelab.graph.adjacency;

import java.math.BigInteger;

/*
 * 邻接表的节点
 * 其中的 label 表示节点的实际内容，为了满足节点的唯一性和能够作为 key 存入 hashmap，重写掉 equals 和 hashcode
 */
public class Vertex {
    private String label;

    Vertex(String label) {
        this.label = label;
    }

    @Override
    public int hashCode() {
        return new BigInteger(this.label.getBytes()).intValue();
    }

    @Override
    public boolean equals(Object vertex) {
        return vertex != null && this.hashCode() == vertex.hashCode();
    }
}
