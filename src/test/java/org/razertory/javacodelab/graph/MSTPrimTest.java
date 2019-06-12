package org.razertory.javacodelab.graph;

import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.razertory.javacodelab.graph.matrix.MGraph;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MSTPrimTest {

    @Test
    public void mst() {
        MGraph mGraph = GraphHelper.createMgraph();
        MSTPrim mstPrim = new MSTPrim(mGraph.map.length);
        int[] ret = mstPrim.mst(mGraph.map);
        System.out.println(ret);
    }
}