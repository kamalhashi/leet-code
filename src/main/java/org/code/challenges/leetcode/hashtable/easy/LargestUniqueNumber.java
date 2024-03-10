package org.code.challenges.leetcode.hashtable.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestUniqueNumber {

    public static int largestUniqueNumber_BySorting(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == 0 || nums[i] != nums[i - 1]) return nums[i];

            // While duplicates exist.
            while (i > 0 && nums[i] == nums[i - 1]) {
                i--;
            }
        }
        return -1;
    }

    public static int largestUniqueNumber_HashMap(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        int result = -1;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                result = Math.max(result, entry.getKey());
            }
        }
        return result;


    }


    public static void main(String[] args) {
        System.out.println(largestUniqueNumber_HashMap(new int[]{2, 5, 5}));

    }
}
