package org.razertory.javacodelab.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
    private MergeSort mergeSort;

    @Before
    public void setUp() {
        mergeSort = new MergeSort();
    }

    @Test
    public void sort() {
        int[] array = SortHelper.randomArray(100);
        mergeSort.sort(array);
        Assert.assertTrue(SortHelper.validate(array));
    }
}