package org.razertory.datastructure.dp; import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoinTest {
    int[] coins;
    int value;

    @Before
    public void setup(){
        this.coins = new int[]{5, 3, 4, 8, 6, 7};
        this.value = 625;
    }

    @Test
    public void coinDP() {
        Coin coin = new Coin();
        int result = coin.coinDP(coins, value);
        Assert.assertEquals(79, result);
    }

    @Test
    public void coinRecursion() {
        Coin coin = new Coin();
        int result = coin.coinRecursion(coins, coins.length, value);
        Assert.assertEquals(79, result);
    }
}