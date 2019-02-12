package org.razertory.datastructure.advanced;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LRUCacheTest {

    private LRUCache lruCache;
    private int[] nums;

    @Before
    public void setup() {
        this.nums = new int[] {1, 2, 3, 4};
        this.lruCache = new LRUCache(nums.length);
    }

    @Test
    public void getPut() {
        for (int num: nums) {
            lruCache.put(num, num);
        }
        lruCache.put(5, 5);
        Assert.assertEquals(-1, lruCache.get(1));
        lruCache.put(6, 6);
        Assert.assertEquals(-1, lruCache.get(2));
    }

}