package org.code.challenges.leetcode.arrays.easy.slidewindow;

//https://leetcode.com/problems/maximum-average-subarray-i/
public class MaximumAverageSubarrayI {

    public static double findMaxAverage(int[] nums, int k) {

        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double result = sum / k;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            result = Math.max(result, sum);
        }
        return result / k;
    }

    public static void main(String[] args) {
        System.out.println("Result:" + findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }
}
