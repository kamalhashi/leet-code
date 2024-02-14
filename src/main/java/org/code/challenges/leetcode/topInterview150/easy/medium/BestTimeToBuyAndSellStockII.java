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

    public static int solution2(int[] prices) {
        int total = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                total += prices[i] - prices[i - 1];
            }
        }
        return total;
    }


    //Approach 2: Peak Valley Approach with for loop
    public static int solution3(int[] prices) {
        int total = 0;
        int valley = Integer.MAX_VALUE;
        int peak = valley;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < peak) {
                total += peak - valley;
                valley = prices[i];
                peak = valley;
            } else {
                peak = prices[i];
            }
        }
        total += peak - valley;
        return total;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 6, 9, 10};
        System.out.println(solution3(prices));
    }
}