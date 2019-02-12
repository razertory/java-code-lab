package org.razertory.javacodelab.graph.adjacency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * 树的临接表表示法
 * 临接表 adjVertices 就是将每个节点 vertex 作为 key, 与之相连的节点组成的数组或链表作为 value 最终形成的数据结构
 */
public class AGraph {
    private HashMap<Vertex, List<Vertex>> adjVertices;

    public AGraph(){
        this.adjVertices = new HashMap<>();
    }

    public void addVertex(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    public void removeVertex(String label) {
        adjVertices.remove(new Vertex(label));
    }

    public void addEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    public void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }
}
