package org.razertory.datastructure.dp;

/**
 * @author: Razertory
 * @description: Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.
 * 给定一个非负整数集，和一个给定的和，判断是否这个集合中包含一个子集，并且这个子集的和为目标值
 * @create: 2018-06-27-13
 */
public class SubsetSum {

    /**
     * @param set   整数集合
     * @param n     整数集合大小
     * @param value 目标值
     * @return
     * @description 状态转移方程的递归实现
     */
    public boolean subsetSumRecursion(int[] set, int n, int value) {
        if (value == 0) {
            return true;
        }
        if (n == 0 && value != 0) {
            return false;
        }
        if (set[n - 1] > value) {
            return subsetSumRecursion(set, n - 1, value);
        }

        return subsetSumRecursion(set, n - 1, value) ||
                subsetSumRecursion(set, n - 1, value - set[n - 1]);
    }

    /**
     * @param set
     * @param n
     * @param value
     * @return
     * @description dp实现
     */
    public boolean subsetSumDP(int[] set, int n, int value) {
        boolean[][] dp = new boolean[value + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            dp[0][i] = true;
        }
        for (int i = 0; i <= value; i++) {
            dp[i][0] = false;
        }

        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i][j - 1];
                if (i >= set[j - 1]) {
                    dp[i][j] = dp[i][j] || dp[i - set[j - 1]][j - 1];
                }
            }
        }

        return dp[value][n];
    }


}
