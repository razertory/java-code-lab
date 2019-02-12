package org.razertory.datastructure.graph.adjacency;

import org.junit.Before;
import org.junit.Test;
import org.razertory.datastructure.graph.GraphHelper;

public class AGraphTest {
    AGraph aGraph;

    @Before
    public void setup() {
        aGraph = GraphHelper.createAGraph();
    }

    @Test
    public void addVertex() {
        aGraph.addVertex("Nikita");
    }

    @Test
    public void removeVertex() {
        aGraph.addVertex("Nikita");
        aGraph.removeVertex("Nikita");
    }

    @Test
    public void addEdge() {
        aGraph.addVertex("Nikita");
        aGraph.addEdge("Bob", "Nikita");
    }

    @Test(expected = NullPointerException.class)
    public void addErrorEdge() {
        aGraph.addEdge("Bob", "Nikita");
    }

    @Test
    public void removeEdge() {
        aGraph.addVertex("Nikita");
        aGraph.addEdge("Bob", "Nikita");
        aGraph.removeEdge("Nikita", "Bob");
    }
}