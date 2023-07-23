package org.code.challenges.leetcode.arrays.medium.slidewindow;

import java.util.Arrays;

public class KRadiusSubarrayAverages_SlideWindow {

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

        long windowSum = 0;
        for (int i = 0; i < (2 * k + 1); ++i) {
            windowSum += nums[i];
        }
        averages[k] = (int) (windowSum / (2 * k + 1));

        for (int i = (2 * k + 1); i < n; ++i) {
            windowSum = windowSum - nums[i - (2 * k + 1)] + nums[i];
            averages[i - k] = (int) (windowSum / (2 * k + 1));
        }
        return averages;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAverages(new int[]{2, 1, 3, 4, 5, 8, 1}, 2)));
    }
}
