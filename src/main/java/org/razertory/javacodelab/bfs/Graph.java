package org.razertory.javacodelab.bfs;

import org.razertory.javacodelab.graph.adjacency.AGraph;
import org.razertory.javacodelab.graph.adjacency.Vertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * BFS 遍历图
 **/
public class Graph {
    public ArrayList<Integer> bsfSearch(AGraph aGraph, Vertex start) {
        ArrayList<Integer> order = new ArrayList<>();
        HashMap<Vertex, Boolean> visited = new HashMap<>();
        LinkedList<Vertex> queue = new LinkedList<>();

        visited.put(start, true);
        queue.add(start);

        while (queue.size() != 0) {
            start = queue.poll();
            order.add(start.val);
            for (Vertex vertex : aGraph.adjVertices.get(start)) {
                if (!visited.containsKey(vertex)) {
                    visited.put(vertex, true);
                    queue.add(vertex);
                }
            }
        }

        return order;
    }
}
