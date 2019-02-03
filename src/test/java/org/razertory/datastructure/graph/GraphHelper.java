package org.razertory.datastructure.graph;

import org.razertory.datastructure.graph.adjacency.AGraph;

public class GraphHelper {

    public static AGraph createDefaultAGraph() {
        AGraph agraph = new AGraph();
        agraph.addVertex("Bob");
        agraph.addVertex("Alice");
        agraph.addVertex("Mark");
        agraph.addVertex("Rob");
        agraph.addVertex("Maria");
        agraph.addEdge("Bob", "Alice");
        agraph.addEdge("Bob", "Rob");
        agraph.addEdge("Alice", "Mark");
        agraph.addEdge("Rob", "Mark");
        agraph.addEdge("Alice", "Maria");
        agraph.addEdge("Rob", "Maria");
        return agraph;
    }
}
