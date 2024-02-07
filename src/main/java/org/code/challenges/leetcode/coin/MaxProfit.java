package org.code.challenges.leetcode.coin;

public class MaxProfit {

    static int maxProfit(int prices[]) {
        int n = prices.length;
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < n; i++) {

            // Checking for lower buy value
            if (buy > prices[i])
                buy = prices[i];

                // Checking for higher profit
            else if (prices[i] - buy > max_profit)
                max_profit = prices[i] - buy;
        }
        return max_profit;
    }

    // Driver Code
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 6, 4};
        int max_profit = maxProfit(prices);
        System.out.println(max_profit);
    }
}