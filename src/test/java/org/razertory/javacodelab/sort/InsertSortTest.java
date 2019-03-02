package org.razertory.javacodelab.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertSortTest {
    private InsertSort insertSort;

    @Before
    public void setup() {
        insertSort = new InsertSort();
    }

    @Test
    public void sort() {
        int[] arr = SortHelper.randomArray(100);
        insertSort.sort(arr);
        Assert.assertTrue(SortHelper.validate(arr));
    }
}