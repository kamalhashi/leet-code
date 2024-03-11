package org.code.challenges.leetcode.hashing.medium;

import java.util.HashMap;
import java.util.Map;

//NEED to write more test cases
public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);

        int ans = 0;
        int curr = 0;

        for (int num : nums) {
            curr += num;
            ans += counts.getOrDefault(curr - k, 0);
            counts.put(curr, counts.getOrDefault(curr, 0) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 2, 1, 2, 1, 1}, 3));
    }

}
