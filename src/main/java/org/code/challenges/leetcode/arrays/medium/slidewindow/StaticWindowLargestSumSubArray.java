package org.code.challenges.leetcode.arrays.medium.slidewindow;

/**
 * Given an integer array nums and an integer k, find the sum of
 * the subarray with the largest sum whose length is k.
 */
public class StaticWindowLargestSumSubArray {

    public static int findBestSubArray(int[] nums, int k) {
        int curr = 0;


        for (int i = 0; i < k ; i++) {
            curr += nums[i];
        }
        int ans = curr;

        for (int i = k; i < nums.length; i++) {
            curr += nums[i] - nums[i - k];
            ans = Math.max(ans, curr);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findBestSubArray(new int[]{3, -1, 4, 12 , -8, 5, 6}, 4));
    }
}
