package org.code.challenges.leetcode.dp;

public class FibonacciDP {

    //bottom-up approach
    public static int fibBottomUp(int n) {
        if (n <= 1) {
            return n;
        }
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }

    //recursive top-down
    public static int fibTopDown(int n) {
        int[] memo = new int[n + 1];
        return helper(n, memo);
    }

    public static int helper(int n, int[] memo) {
        if (n == 1 || n == 2) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
        return memo[n];
    }
}
