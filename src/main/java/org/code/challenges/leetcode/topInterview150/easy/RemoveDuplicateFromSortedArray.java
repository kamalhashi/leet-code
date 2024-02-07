package org.code.challenges.leetcode.topInterview150.easy;

public class RemoveDuplicateFromSortedArray {
    public static int solution1(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
