package org.razertory.javacodelab.backtrack;

import org.junit.Assert;
import org.junit.Test;
import org.razertory.javacodelab.backtrack.NQueen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueenTest {

    @Test
    public void solveNQueens() {
        NQueen nQueen = new NQueen();
        List<List<String>> expect = new ArrayList();
        expect.add(Arrays.asList(".Q..", "...Q", "Q...", "..Q."));
        expect.add(Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));
        Assert.assertEquals(expect, nQueen.solveNQueens(4));
    }
}