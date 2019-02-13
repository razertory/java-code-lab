package org.razertory.javacodelab.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KthBigestTest {
    private int index = 1;
    private int []nums = null;
    private KthBigest kthBigest = null;

    @Before
    public void setup() {
       index = 2;
       nums = new int[]{3,2,1,5,6,4};
       kthBigest = new KthBigest();
    }

    @Test
    public void kthLargestElement() {
        Assert.assertEquals(5, kthBigest.findByQuickSort(index, nums));
    }

    @Test
    public void kthLargestElementByQueue() {
        Assert.assertEquals(5, kthBigest.findWithPriorityQueue(index, nums));
    }
}