package org.code.challenges.leetcode.arrays.medium.prefixsum;

import java.util.Arrays;

public class KRadiusSubarrayAverages_PrefixSolution {

    // prefixSum array of size (n+1)
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

    public static int[] getAverages2(int[] nums, int k) {
        if (k == 0) {
            return nums;
        }
        int n = nums.length;
        int[] averages = new int[n];
        Arrays.fill(averages, -1);

        if (2 * k + 1 > n) {
            return averages;
        }

        long[] prefixSum = new long[n];
        prefixSum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        System.out.println(Arrays.toString(prefixSum));

        for (int i = k; i < (n - k); i++) {
            int leftBound = i - k;
            int rightBound = i + k;
            long subArraySum = prefixSum[rightBound];

            if (leftBound > 0)
                subArraySum -= prefixSum[leftBound - 1];

            int average = (int) (subArraySum / (2 * k + 1));
            averages[i] = average;
        }
        return averages;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAverages(new int[]{2, 1, 3, 4, 5, 8, 1}, 2)));
    }
}
