package org.code.challenges.leetcode.arrays.medium.prefixsum;

import java.util.Arrays;

public class NumberOfWaysToSplitArray {
    public static int waysToSplitArray(int[] nums) {
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
            if (leftSelection > rightSelection) {
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(waysToSplitArray(new int[]{10, 4, -8, 7}));
    }
}
