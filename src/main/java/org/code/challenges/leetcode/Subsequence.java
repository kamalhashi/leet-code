package org.code.challenges.leetcode;

//https://leetcode.com/problems/is-subsequence/
public class Subsequence {
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
        System.out.println(Subsequence.isSubsequence("azc", "hbgdca"));
    }
}
