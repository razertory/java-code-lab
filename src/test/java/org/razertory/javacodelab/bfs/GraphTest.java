package org.razertory.javacodelab.bfs;

import org.junit.Assert;
import org.junit.Test;
import org.razertory.javacodelab.graph.GraphHelper;
import org.razertory.javacodelab.graph.adjacency.AGraph;
import org.razertory.javacodelab.graph.adjacency.Vertex;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void bsfSearch() {
        AGraph aGraph = GraphHelper.createAGraph();
        Graph graph = new Graph();
        graph.bsfSearch(aGraph, new Vertex(0));
        Assert.assertEquals(Arrays.asList(0, 1, 4, 2, 3), graph.bsfSearch(aGraph, new Vertex(0)));
    }
}