package org.code.challenges.leetcode.arrays.medium.prefixsum;

import java.util.Arrays;

public class KRadiusSubarrayAverages_PrefixSolution {

    public static int[] getAverages(int[] nums, int k) {
        if (k == 0) {
            return nums;
        }
        int n = nums.length;
        int[] averages = new int[n];
        Arrays.fill(averages, -1);

        if (2 * k + 1 > n) {
            return averages;
        }

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; ++i) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        for (int i = k; i < (n - k); ++i) {
            int leftBound = i - k, rightBound = i + k;
            long subArraySum = prefix[rightBound + 1] - prefix[leftBound];
            int average = (int) (subArraySum / (2 * k + 1));
            averages[i] = average;
        }
        return averages;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAverages(new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6}, 3)));
    }
}
