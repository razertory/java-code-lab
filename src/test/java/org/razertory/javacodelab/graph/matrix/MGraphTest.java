package org.razertory.javacodelab.graph.matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.razertory.javacodelab.graph.GraphHelper;


public class MGraphTest {

    private MGraph mGraph;

    @Before
    public void setUp() {
        mGraph = GraphHelper.createMgraph();
    }

    @Test
    public void addEdge() {
        mGraph.addEdge(1, 2, 1);
        Assert.assertEquals(1, mGraph.map[1][2]);
    }

    @Test
    public void deleteEdge() {
        mGraph.addEdge(1, 2, 1);
        mGraph.deleteEdge(1, 2);
        Assert.assertEquals(0, mGraph.map[1][2]);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void addNullEdge() {
        mGraph.addEdge(8, 9, 1);
    }

    @Test
    public void addValuedEdge() {
        int value = 7;
        mGraph.addEdge(1, 2, value);
        Assert.assertEquals(value, mGraph.map[1][2]);
    }
}