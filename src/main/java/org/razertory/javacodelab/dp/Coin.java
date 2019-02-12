package org.razertory.javacodelab.dp;

import java.util.Arrays;

/**
 * @author: Razertory
 * @description: 给出面值为： N1, N2, N3 ...的硬币，要求用最少的硬币数找零
 * @create: 2018-06-19
 */
public class Coin {

    /**
     * @param coins: 零钱组合
     * @param value: 钱总额
     * @return 返回最少的硬币个数
     * @description 状态转移方程递归实现
     */
    public int coinRecursion(int[] coins, int m, int value) {
        if (value == 0) return 0;

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            if (coins[i] <= value) {
                int sub_res = coinRecursion(coins, m, value - coins[i]);
                if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                    res = sub_res + 1;
            }
        }
        return res;
    }


    /**
     * @param coins: 零钱组合
     * @param value: 钱总额
     * @return 返回最少的硬币个数
     * @description 用dp数组存结果集
     */
    public int coinDP(int[] coins, int value) {
        int[] dp = new int[value + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i <= value; i++) {
            for (int coin : coins) {
                if (coin <= i && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                }
            }
        }
        return dp[value];
    }


}
