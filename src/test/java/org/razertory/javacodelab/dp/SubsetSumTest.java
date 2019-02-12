package org.razertory.javacodelab.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubsetSumTest {
    int set[];
    int sum;
    int n;
    SubsetSum subsetSum;

    @Before
    public void setup() {
        this.set = new int[]{3, 34, 4, 12, 5, 2};
        this.sum = 9;
        this.n = set.length;
        this.subsetSum = new SubsetSum();
    }

    @Test
    public void subsetSumRecursion() {
        boolean result = subsetSum.subsetSumRecursion(set, n, sum);
        Assert.assertTrue(result);
    }

    @Test
    public void subsetSumDP() {
        boolean result = subsetSum.subsetSumDP(set, n, sum);
        Assert.assertTrue(result);
    }
}