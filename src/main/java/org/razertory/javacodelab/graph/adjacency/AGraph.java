package org.razertory.javacodelab.graph.adjacency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * 临接表
 * 临接表 adjVertices 就是将每个节点 vertex 作为 key, 与之相连的节点组成的数组或链表作为 value 最终形成的数据结构
 * https://www.geeksforgeeks.org/graph-and-its-representations/
 */
public class AGraph {
    public HashMap<Vertex, List<Vertex>> adjVertices;
    public int V;


    public AGraph(int v){
        this.V = v;
        this.adjVertices = new HashMap<>();
    }

    public void addVertex(int val) {
        adjVertices.putIfAbsent(new Vertex(val), new ArrayList<>());
        this.V++;
    }

    public void addEdge(int val1, int val2) {
        Vertex v1 = new Vertex(val1);
        Vertex v2 = new Vertex(val2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    public void removeVertex(int val) {
        adjVertices.remove(new Vertex(val));
        this.V--;
    }

    public void removeEdge(int val1, int val2) {
        Vertex v1 = new Vertex(val1);
        Vertex v2 = new Vertex(val2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }
}
