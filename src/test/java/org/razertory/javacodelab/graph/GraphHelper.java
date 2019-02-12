package org.razertory.javacodelab.graph;

import org.razertory.javacodelab.graph.adjacency.AGraph;
import org.razertory.javacodelab.graph.matrix.MGraph;

public class GraphHelper {

    public static AGraph createAGraph() {
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

    /*
     *    0  1  2  3  4
     * 0  0
     * 1     0
     * 2        0
     * 3           0
     * 4              0
     *
     */
    public static MGraph createMgraph() {
        MGraph mGraph = new MGraph(5);
        mGraph.addEdge(0, 1);
        mGraph.addEdge(2, 3);
        mGraph.addEdge(3, 4);
        mGraph.addEdge(4, 0);
        mGraph.addEdge(4, 2);
        return mGraph;
    }
}
