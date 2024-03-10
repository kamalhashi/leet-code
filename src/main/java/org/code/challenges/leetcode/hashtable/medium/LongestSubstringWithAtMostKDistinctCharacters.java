package org.code.challenges.leetcode.hashtable.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinctCharacters {
    public static int findLongestSubstring(String s, int k) {
        int left = 0;
        int ans = 0;
        Map<Character, Integer> counts = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            counts.put(c, counts.getOrDefault(c, 0) + 1);

            while (counts.size() > k) {
                char remove = s.charAt(left);
                counts.put(remove, counts.get(remove) -1);
                if (counts.get(remove) == 0) {
                    counts.remove(remove);
                }
                left++;
            }

            ans = Math.max(ans, right - left + 1);

        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(findLongestSubstring("eceba", 2));

    }
}
