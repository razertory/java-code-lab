package org.razertory.javacodelab.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {
    private SelectionSort selectionSort;

    @Before
    public void setup() {
        selectionSort = new SelectionSort();
    }

    @Test
    public void sort() {
        int[] array = SortHelper.randomArray(100);
        selectionSort.sort(array);
        Assert.assertTrue(SortHelper.validate(array));
    }
}