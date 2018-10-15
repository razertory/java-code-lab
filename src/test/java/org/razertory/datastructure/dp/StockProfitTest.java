package org.razertory.datastructure.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StockProfitTest {
    private int [] prices = null;

    @Before
    public void setup() {
       prices = new int[] { 7,1,5,3,6,4};
    }

    //int [] prices = {7,1,5,3,6,4};

    @Test
    public void maxProfit() {
        StockProfit stockProfit = new StockProfit();
        Assert.assertEquals(5, stockProfit.maxProfit(prices));
    }
}