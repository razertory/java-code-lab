package org.razertory.datastructure.dp;

import java.util.Arrays;

/**
 * @author: Razertory
 * @description: 给出面值为： N1, N2, N3 ...的硬币，要求用最少的硬币数找零
 * https://blog.csdn.net/niaonao/article/details/78249256
 * @create: 2018-06-19-16
 */
public class Coin {

    /**
     * @param coins:  零钱组合
     * @param value: 钱总额
     * @return 返回最少的硬币个数
     **/
    public int coin(int[] coins, int value) {
        int[] dp = new int[value+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i <= value; i++) {
            for(int coin : coins) {
                if(coin <= i && dp[i-coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i-coin]+1, dp[i]);
                }
            }
        }
        return dp[value];
    }
}
