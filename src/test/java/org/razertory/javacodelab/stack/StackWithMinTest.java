package org.razertory.javacodelab.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackWithMinTest {

    private StackWithMin stackWithMin;
    private int[] nums;

    @Before
    public void setup() {
        stackWithMin = new StackWithMin();
        nums = new int[]{1, 3, 4, 12, 22, 4, 5};
    }

    @Test
    public void testPushPop() {
        for (int num: nums) {
            stackWithMin.push(num);
        }
        Assert.assertEquals((int)stackWithMin.min(), 1);

        stackWithMin.push(0);
        Assert.assertEquals((int) stackWithMin.min(), 0);
    }
}