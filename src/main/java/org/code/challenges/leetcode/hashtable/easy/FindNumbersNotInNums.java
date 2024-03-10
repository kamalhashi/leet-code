package org.code.challenges.leetcode.hashtable.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given an integer array nums, find all the numbers x that satisfy the following:
 * x + 1 is not in nums, and x - 1 is not in nums.
 */
public class FindNumbersNotInNums {

    public List<Integer> findNumbers(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            numSet.add(num);
        }

        for (int num : nums) {
            if (!numSet.contains(num + 1) && !numSet.contains(num - 1)) {
                ans.add(num);
            }
        }
        return ans;
    }
}
