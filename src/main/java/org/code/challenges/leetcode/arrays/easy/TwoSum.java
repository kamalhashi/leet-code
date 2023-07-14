package org.code.challenges.leetcode.arrays.easy;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static boolean checkForTarget(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int current = nums[left] + nums[right];

            if (current == target) {
                return true;
            }

            if (current > target) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("checkForTarget:" + TwoSum.checkForTarget(new int[]{3, 6, 21, 23, 25}, 27));
    }
}
