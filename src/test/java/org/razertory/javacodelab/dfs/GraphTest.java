package org.razertory.javacodelab.dfs;

import org.junit.Assert;
import org.junit.Test;
import org.razertory.javacodelab.graph.GraphHelper;
import org.razertory.javacodelab.graph.adjacency.AGraph;
import org.razertory.javacodelab.graph.adjacency.Vertex;

import java.util.Arrays;


public class GraphTest {

    @Test
    public void dfsSearch() {
        AGraph aGraph = GraphHelper.createAGraph();
        Graph graph = new Graph();
        graph.dfsSearch(aGraph, new Vertex(0));
        Assert.assertEquals(Arrays.asList(0, 1, 2, 3, 4), graph.dfsSearch(aGraph, new Vertex(0)));
    }
}