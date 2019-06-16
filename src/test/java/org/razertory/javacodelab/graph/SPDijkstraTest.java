package org.razertory.javacodelab.graph;

import org.junit.Assert;
import org.junit.Test;
import org.razertory.javacodelab.graph.adjacency.AGraph;
import org.razertory.javacodelab.graph.adjacency.Vertex;

import java.util.HashMap;

public class SPDijkstraTest {

    @Test
    public void dijkstra() {
        AGraph aGraph = GraphHelper.createAGraph();
        SPDijkstra spDijkstra = new SPDijkstra();
        HashMap<Vertex, Integer> dist =  spDijkstra.dijkstra(aGraph, new Vertex(0));
        System.out.println(dist);
        Assert.assertEquals(new Integer(3), dist.get(new Vertex(2)));
    }
}