package org.razertory.javacodelab.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {
    private QuickSort quickSort;

    @Before
    public void setup() {
        quickSort = new QuickSort();
    }

    @Test
    public void sort() {
        int[] array = SortHelper.randomArray(100);
        quickSort.sort(array);
        Assert.assertTrue(SortHelper.validate(array));
    }
}