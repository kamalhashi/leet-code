package org.code.challenges.leetcode.topInterview150.easy;

public class RemoveDuplicateFromSortedArrayII {

    public static int solution1(int[] nums) {
        int count = 1, j = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
