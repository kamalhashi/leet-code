package org.code.challenges.leetcode.topInterview150.easy;

//121. Best Time to Buy and Sell Stock
public class BestTimeToBuySellStock {

    //Brute force
    public static int solution1(int[] prices) {
        int largestDifference = 0;
        for (int buyDay = 0; buyDay < prices.length; buyDay++) {
            for (int sellDay = buyDay + 1; sellDay < prices.length; sellDay++) {
                int currentDifference = prices[sellDay] - prices[buyDay];

                if (currentDifference > largestDifference) {
                    largestDifference = currentDifference;
                }
            }
        }
        return largestDifference;
    }

    //one pass
    public static int solution2(int[] prices) {
        int miniPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < miniPrice) {
                miniPrice = prices[i];
            } else if (prices[i] - miniPrice > maxProfit) {
                maxProfit = prices[i] - miniPrice;
            }
        }
        return maxProfit;
    }

}
