package org.code.challenges.leetcode.arrays.medium.prefixsum;

/**
 * This solution uses array to calculate prefix sum , Do we need array  to calculate the prefix sum ? no,
 * we can use variable to calculate the sum of prefix, thus reducing
 * see this solution @see org.code.challenges.leetcode.arrays.medium.prefixsum.NumberOfWaysToSplitArray2#NumberOfWaysToSplitArray1()
 */
public class NumberOfWaysToSplitArrayWithArray {
    public static int waysToSplitArrayWithArray(int[] nums) {
        int n = nums.length;

        long[] prefix = new long[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        int ans = 0;

        for (int i = 0; i < n - 1; i++) {
            long leftSelection = prefix[i];
            long rightSelection = prefix[n - 1] - prefix[i];
            if (leftSelection >= rightSelection) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(waysToSplitArrayWithArray(new int[]{10, 4, -8, 7}));
    }
}
