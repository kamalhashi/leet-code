package org.code.challenges.leetcode.arrays.easy;

//Minimum Value to Get Positive Step by Step Sum
//https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
public class MinimumValueToGetPositiveStepByStepSum_BruteForce {
    public static int minStartValue_BruteForceSolution(int[] nums) {
        int startValue = 1;
        while (true) {
            int total = startValue;
            boolean isValid = true;
            for (int num : nums) {
                total += num;
                if (total < 1) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                return startValue;
            } else {
                startValue += 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(minStartValue_BruteForceSolution(new int[]{-3, 2, -3, 4, 2}));
    }
}

