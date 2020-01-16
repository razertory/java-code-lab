package org.razertory.javacodelab.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeapSortTest {
    private BubbleSort bubbleSort;

    @Before
    public void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void sort() {
        int[] arr = SortHelper.randomArray(100);
        bubbleSort.sort(arr);
        Assert.assertTrue(SortHelper.validate(arr));
    }
}