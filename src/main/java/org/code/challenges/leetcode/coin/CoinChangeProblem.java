package org.code.challenges.leetcode.coin;
//https://stackoverflow.com/questions/6184869/what-is-the-difference-between-memoization-and-dynamic-programming
//https://leetcode.com/problems/coin-change/solutions/77368/java-both-iterative-and-recursive-solutions-with-explanations/
//https://kalkicode.com/coin-change-using-greedy-algorithm-in-java
//https://www.youtube.com/watch?v=jaNZ83Q3QGc
public class CoinChangeProblem {

    public static int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;
        int[] dp = new int[amount + 1];
        int sum = 0;

        while (++sum <= amount) {
            int min = -1;
            for (int coin : coins) {
                if (sum >= coin && dp[sum - coin] != -1) {
                    int temp = dp[sum - coin] + 1;
                    min = min < 0 ? temp : (Math.min(temp, min));
                }
            }
            dp[sum] = min;
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
    }
}
