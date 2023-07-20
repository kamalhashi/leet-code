package org.code.challenges.leetcode.arrays.easy;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static int[] runningSumWithArray(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }

    public static int[] runningSumWithoutArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSumWithoutArray(new int[]{1, 2, 3, 4})));
    }
}
