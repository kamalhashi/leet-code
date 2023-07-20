package org.code.challenges.leetcode.arrays.medium.prefixsum;

/**
 * This solution does not use an array to calculate prefix sum
 */
public class NumberOfWaysToSplitArray2 {
    public static int waysToSplitArrayWithoutArray(int[] nums) {
        int ans = 0;
        long leftSelection = 0;
        long total = 0;

        for (int num : nums) {
            total += num;
        }


        for (int i = 0; i < nums.length - 1; i++) {
            leftSelection += nums[i];
            long rightSelection = total - leftSelection;
            if (leftSelection >= rightSelection) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(waysToSplitArrayWithoutArray(new int[]{10, 4, -8, 7}));
    }
}
