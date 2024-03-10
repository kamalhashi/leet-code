package org.code.challenges.leetcode.hashtable.easy;

//https://leetcode.com/problems/two-sum/

//Solution: Hash Table

import java.util.*;

public class TwoSum_HashTable {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement))
                return new int[]{map.get(complement), i};

            map.put(nums[i], i);

        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 1}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));

    }
}
