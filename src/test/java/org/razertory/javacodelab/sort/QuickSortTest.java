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

    /**
     * 测试分割法
     */
    @Test
    public void hoarePatition() {
        int[] arr = SortHelper.randomArray(100);
        int p = quickSort.hoarePartition(arr, 0, 99);
        for (int i = 0; i <= p; i++) {
            Assert.assertTrue(arr[i] <= arr[p]);
        }

        for (int i = p; i < 100; i++) {
            Assert.assertTrue(arr[i] >= arr[p]);
        }
    }

    /**
     * 测试分割法
     */
    @Test
    public void patition() {
        int[] arr = SortHelper.randomArray(100);
        int p = quickSort.partition(arr, 0, 99);
        for (int i = 0; i <= p; i++) {
            Assert.assertTrue(arr[i] <= arr[p]);
        }

        for (int i = p; i < 100; i++) {
            Assert.assertTrue(arr[i] >= arr[p]);
        }
    }
}