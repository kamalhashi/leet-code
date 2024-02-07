package org.code.challenges.leetcode.topInterview150.easy;

public class RemoveElement {
    public static int solution1(int[] nums, int val) {
        int reader = 0, writer = 0;

        while (reader < nums.length) {
            if (nums[reader] == val) {
                reader++;
            } else {
                nums[writer] = nums[reader];
                reader++;
                writer++;
            }
        }
        return writer;

    }
}
