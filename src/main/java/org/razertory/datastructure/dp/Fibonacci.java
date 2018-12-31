package org.razertory.datastructure.dp;

/**
 * @Date 2018/12/31
 * @Author springchan
 * @Description 斐波那契数列，形如 1, 1, 2, 3, 5, 8, 13, 21... => F(n) = F(n-1) + F(n-2)
 **/
public class Fibonacci {
    int[] dp;

    Fibonacci(){}

    Fibonacci(int n) {
        dp = new int[n];
    }

    /**
     * @author razertory
     * @date 2018/12/31
     * @description 递归实现斐波那契数列
     */
    public int fibRecur(int n) {
        if (n == 1 || n == 2) return 1;
        return fibRecur(n - 1) + fibRecur(n - 2);
    }

    /**
     * @author razertory
     * @date 2018/12/31
     * @description 迭代实现斐波那契数列
     */
    public int fibIte(int n) {
        int fib = 0,  a = 1, b = 1;

        if (n < 3) return 1;

        for (int i = 3; i <= n; i++) {
            fib = a + b;
            b = a;
            a = fib;
        }
        return fib;
    }

    /**
     * @author razertory
     * @date 2018/12/31
     * @description 动态规划实现斐波那契数列
     */
    public int fibDP(int n) {
        if (n == 1 || n == 2) return 1;

        if(dp[n] != 0) return dp[n];

        dp[n] = fibDP(n - 1) + fibDP(n - 2);

        return dp[n];
    }

}
