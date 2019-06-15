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
        for (int i = 1; i < mGraph.map.length; i++) {
            System.out.println(ret[i] + " - " + i + "\t" + mGraph.map[i][ret[i]]);
        }
    }
}