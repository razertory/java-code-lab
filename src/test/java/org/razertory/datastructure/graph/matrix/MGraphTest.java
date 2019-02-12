package org.razertory.datastructure.graph.matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.razertory.datastructure.graph.GraphHelper;

import static org.junit.Assert.*;

public class MGraphTest {

    MGraph mGraph;

    @Before
    public void setUp() {
        mGraph = GraphHelper.createMgraph();
    }

    @Test
    public void addEdge() {
        mGraph.addEdge(1, 2);
        Assert.assertEquals(1, mGraph.map[1][2]);
    }

    @Test
    public void deleteEdge() {
        mGraph.addEdge(1, 2);
        mGraph.deleteEdge(1, 2);
        Assert.assertEquals(0, mGraph.map[1][2]);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void addNullEdge() {
        mGraph.addEdge(8, 9);
    }
}