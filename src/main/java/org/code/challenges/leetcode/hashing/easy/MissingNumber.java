package org.code.challenges.leetcode.hashing.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/missing-number
public class MissingNumber {
    public static int missingNumber_Sort(int[] nums) {
        Arrays.sort(nums);
        if (nums[nums.length - 1] != nums.length) {
            return nums.length;
        }
        if (nums[0] != 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            int expectedNum = nums[i - 1] + 1;
            if (nums[i] != expectedNum) {
                return expectedNum;
            }
        }
        // Array was not missing any numbers
        return -1;
    }

    public static int missingNumber_HashSet(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);

        }

        for (int i = 0; i <=nums.length; i++) {
            if(!numSet.contains(i)){
                return  i;
            }

        }

        return -1;
    }


    public static void main(String[] args) {
        System.out.println(missingNumber_Sort(new int[]{3, 0, 1}));
        System.out.println(missingNumber_Sort(new int[]{0, 1, 2, 3, 4}));
        System.out.println(missingNumber_HashSet(new int[]{3, 0, 1}));
        System.out.println(missingNumber_HashSet(new int[]{0, 1, 2, 3, 4}));


    }
}
