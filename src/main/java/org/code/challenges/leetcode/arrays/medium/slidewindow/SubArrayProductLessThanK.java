package org.code.challenges.leetcode.arrays.medium.slidewindow;

/**
 * https://leetcode.com/problems/subarray-product-less-than-k/
 */
public class SubArrayProductLessThanK {

    public static int numSubArrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int ans = 0;
        int left = 0;
        int curr = 1;

        for (int right = 0; right < nums.length; right++) {
            curr *= nums[right];
            while (curr >= k) {
                curr = curr / nums[left];
                left++;
            }
            ans += right - left + 1;
        }

        return ans;
    }


    public static void main(String[] args) {
        System.out.println(numSubArrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
    }
}
