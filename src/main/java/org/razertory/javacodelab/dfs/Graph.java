package org.razertory.javacodelab.dfs;

import org.razertory.javacodelab.graph.adjacency.AGraph;
import org.razertory.javacodelab.graph.adjacency.Vertex;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author springchan
 * @date 2019/6/7
 * @description
 **/
public class Graph {
    public ArrayList<Integer> dfsSearch(AGraph aGraph, Vertex start) {
        HashMap<Vertex, Boolean> visited = new HashMap<>();
        ArrayList<Integer> order = new ArrayList<>();
        dfsHelper(aGraph, start, visited, order);
        return order;
    }

    private void dfsHelper(AGraph aGraph, Vertex vertex, HashMap<Vertex, Boolean> visited, ArrayList<Integer> order) {
        visited.put(vertex, true);
        order.add(vertex.val);
        for (Vertex v :aGraph.adjVertices.get(vertex)) {
            if (!visited.containsKey(v)) {
                dfsHelper(aGraph, v, visited, order);
            }
        }
    }
}
