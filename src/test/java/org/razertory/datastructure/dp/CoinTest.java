package org.razertory.datastructure.dp; import org.junit.Test;

public class CoinTest {

    @Test
    public void coin() {
        Coin coin = new Coin();
        int result = coin.coin(new int[]{5, 3, 4, 8, 6, 7}, 13);
        System.out.println(result);
    }
}