package org.code.challenges.leetcode.topInterview150.easy.medium;


public class BestTimeToBuyAndSellStockII {


    //Approach 2: Peak Valley Approach
    public static int solution1(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;

    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 6, 9, 10};
        System.out.println(solution1(prices));

    }
}