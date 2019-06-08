package org.razertory.javacodelab.backtrack;

import org.junit.Assert;
import org.junit.Test;
import org.razertory.javacodelab.backtrack.SubSet;

import java.util.Arrays;
import java.util.List;

public class SubSetTest {

    @Test
    public void subsets() {
        SubSet subSet = new SubSet();
        List<List<Integer>> actual = subSet.subsets(new int[] {1,2,3});
        List<List<Integer>> expect = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(1, 2),
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3),
                Arrays.asList(2),
                Arrays.asList(2, 3),
                Arrays.asList(3)
        );
        Assert.assertEquals(expect, actual);
    }
}