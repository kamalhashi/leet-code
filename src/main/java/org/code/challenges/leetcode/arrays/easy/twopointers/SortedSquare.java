package org.code.challenges.leetcode.arrays.easy.twopointers;

import java.util.Arrays;

public class SortedSquare {
    public static int[] solutionOne(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;
    }

    public static int[] solutionTwo(int[] nums) {

        int right = nums.length - 1;

        int[] result = new int[right + 1];
        int index = right;
        int left = 0;

        while (left <= right) {

            if (Math.abs(nums[right]) > Math.abs(nums[left])) {
                result[index] = nums[right] * nums[right];
                right--;
            } else {
                result[index] = nums[left] * nums[left];
                left++;
            }
            index--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solutionTwo(new int[]{-3, -2, -1, 4, 5, 6})));
    }
}
