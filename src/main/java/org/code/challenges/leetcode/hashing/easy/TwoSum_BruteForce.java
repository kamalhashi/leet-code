package org.code.challenges.leetcode.hashing.easy;

//https://leetcode.com/problems/two-sum/

//Solution:Brute Force

import java.util.Arrays;

public class TwoSum_BruteForce {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++)
                if (nums[j] == target - nums[i])
                    return new int[]{i, j};


        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 1}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));

    }
}
