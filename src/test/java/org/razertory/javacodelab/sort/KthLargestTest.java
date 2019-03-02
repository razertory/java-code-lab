package org.razertory.javacodelab.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KthLargestTest {
    private int k = 1;
    private int []nums = null;
    private KthLargest kthLargest = null;

    @Before
    public void setup() {
       k = 2;
       nums = new int[]{3,2,1,5,6,4};
       kthLargest = new KthLargest();
    }

    @Test
    public void kthLargestElement() {
        Assert.assertEquals(5, kthLargest.findByQuickSort(k, nums));
    }

    @Test
    public void kthLargestElementByQueue() {
        Assert.assertEquals(5, kthLargest.findWithPriorityQueue(k, nums));
    }
}