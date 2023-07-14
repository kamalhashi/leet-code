package org.code.challenges.leetcode.arrays.medium.slidewindow;

/**
 * Given an array of positive integers nums and an integer k, find the length of the longest subarray whose sum is less
 * than or equal to k. This is the problem we have been talking about above. We will now formally solve it.
 */
public class SumLongestSubArray {
    public static int findLength(int[] nums, int k) {
        int left = 0;
        int curr = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {
            curr += nums[right];

            while (curr > k) {
                curr -= nums[left];
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findLength(new int[]{1, 2, 1, 2, 1}, 3));
    }
}
