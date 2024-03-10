package org.code.challenges.leetcode.hashtable.easy;

import java.util.*;

//https://leetcode.com/problems/intersection-of-multiple-arrays/
public class IntersectionOfMultipleArrays {
    public static List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int[] arr : nums) {
            for (int x : arr) {
                counts.put(x, counts.getOrDefault(x, 0) + 1);
            }
        }
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for (int key : counts.keySet()) {
            if (counts.get(key) == n) {
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(intersection(new int[][]{{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}}));

    }
}
