package org.code.challenges.leetcode.arrays.easy;

//Is Subsequence
// https://leetcode.com/problems/is-subsequence/
public class IsSubsequence {
    public static  boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main (String[] args){
        System.out.println(IsSubsequence.isSubsequence("azc", "hbgdca"));
    }
}
