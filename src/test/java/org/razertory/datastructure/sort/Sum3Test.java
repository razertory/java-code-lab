package org.razertory.datastructure.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Sum3Test {
    private Sum3 sum3;

    @Before
    public void setup() {
        sum3 = new Sum3();
    }

    @Test
    public void threeSum() {
        List expect = Arrays.asList(
                Arrays.asList(-1, 0, 1),
                Arrays.asList(-1, -1, 2)
        );

        Assert.assertEquals(expect, sum3.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}