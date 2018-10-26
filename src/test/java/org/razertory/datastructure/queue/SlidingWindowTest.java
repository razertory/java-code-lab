package org.razertory.datastructure.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SlidingWindowTest {

    private SlidingWindow slidingWindow;

    @Before
    public void setup() {
        slidingWindow = new SlidingWindow();
    }

    @Test
    public void maxInWindows() {
        Assert.assertEquals(Arrays.asList(4, 4, 6, 6, 6, 5), slidingWindow.maxInWindows(new int[] {2,3,4,2,6,2,5,1}, 3 ));
    }
}