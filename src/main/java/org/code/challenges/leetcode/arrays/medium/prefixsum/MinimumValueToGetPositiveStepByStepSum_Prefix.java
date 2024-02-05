package org.code.challenges.leetcode.arrays.medium.prefixsum;

//Minimum Value to Get Positive Step by Step Sum
public class MinimumValueToGetPositiveStepByStepSum_Prefix {
    public static int minStartValue_PrefixSolution(int[] nums) {
        int sum = 0;
        int minPrefixSum = 0;
        for (int number : nums) {
            sum += number;
            minPrefixSum = Math.min(minPrefixSum, sum);
        }
        System.out.println(minPrefixSum);
        return -minPrefixSum + 1;
    }

    public static void main(String[] args) {
        System.out.println(minStartValue_PrefixSolution(new int[]{-3, 2, -3, 4, 2}));
    }
}

