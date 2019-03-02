package org.razertory.javacodelab.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertOptimizeSortTest {
    private InsertOptimizeSort insertOptimizeSort;

    @Before
    public void setUp() {
        insertOptimizeSort = new InsertOptimizeSort();
    }

    @Test
    public void sort() {
        int[] arr = SortHelper.randomArray(100);
        insertOptimizeSort.sort(arr);
        Assert.assertTrue(SortHelper.validate(arr));
    }
}