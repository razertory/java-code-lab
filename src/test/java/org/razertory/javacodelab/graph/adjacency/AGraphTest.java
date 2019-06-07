package org.razertory.javacodelab.graph.adjacency;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.razertory.javacodelab.graph.GraphHelper;

public class AGraphTest {
    AGraph aGraph;

    @Before
    public void setup() {
        aGraph = GraphHelper.createAGraph();
    }

    @Test
    public void addVertex() {
        aGraph.addVertex(5);
        Assert.assertTrue(aGraph.adjVertices.containsKey(new Vertex(5)));
    }

    @Test
    public void removeVertex() {
        aGraph.addVertex(5);
        aGraph.removeVertex(5);
        Assert.assertFalse(aGraph.adjVertices.containsKey(new Vertex(5)));
    }
//
    @Test
    public void addEdge() {
        aGraph.addVertex(5);
        aGraph.addEdge(5, 2);
        Assert.assertTrue(aGraph.adjVertices.containsKey(new Vertex(5)));
        Assert.assertTrue(aGraph.adjVertices.get(new Vertex(5)).contains(new Vertex(2)));
    }

    @Test(expected = NullPointerException.class)
    public void addErrorEdge() {
        aGraph.addEdge(8, 9);
    }

    @Test
    public void removeEdge() {
        aGraph.addVertex(5);
        aGraph.addEdge(5, 2);
        aGraph.removeEdge(5, 2);
        Assert.assertTrue(aGraph.adjVertices.containsKey(new Vertex(5)));
        Assert.assertFalse(aGraph.adjVertices.get(new Vertex(5)).contains(new Vertex(2)));
    }
}