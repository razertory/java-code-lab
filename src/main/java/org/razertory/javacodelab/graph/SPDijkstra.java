package org.razertory.javacodelab.graph;

import org.razertory.javacodelab.graph.adjacency.AGraph;
import org.razertory.javacodelab.graph.adjacency.Vertex;

import java.util.*;

/**
 * Dijkstra 最短路径算法
 * BFS + PriorityQueue
 */
public class SPDijkstra {
    // val 表示距离
    Comparator<Vertex> comparator = new Comparator<Vertex>() {
        @Override
        public int compare(Vertex v1, Vertex v2) {
            return v1.val - v2.val;
        }
    };

    public HashMap<Vertex, Integer> dijkstra(AGraph aGraph, Vertex start) {
        HashMap<Vertex, Vertex> parent = new HashMap<>();
        HashMap<Vertex, Integer> distance = new HashMap<>();
        initDistance(distance, aGraph, start);
        PriorityQueue<Vertex> pq = new PriorityQueue<>(comparator);
        HashSet<Vertex> visited = new HashSet<>();
        pq.add(start);

        while (pq.size() != 0) {
            Vertex vertex = pq.poll();
            visited.add(vertex);
            List<Vertex> vertices = aGraph.adjVertices.get(vertex);
            for (Vertex v : vertices) {
                if (visited.contains(v)) continue;

                int curDist = vertex.val + v.val;

                if (curDist >= distance.get(v)) continue;

                pq.add(v);
                distance.put(v, curDist);
                parent.put(v, vertex);
            }
        }
        return distance;
    }

    private void initDistance(HashMap<Vertex, Integer> distance, AGraph aGraph, Vertex start) {
        aGraph.adjVertices.forEach((k, v) -> {
            if (k.equals(start))
                distance.put(k, 0);
            else
                distance.put(k, Integer.MAX_VALUE);
        });
    }
}
