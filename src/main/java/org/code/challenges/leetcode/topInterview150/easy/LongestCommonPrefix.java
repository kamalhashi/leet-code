package org.code.challenges.leetcode.topInterview150.easy;

public class LongestCommonPrefix {


    //Horizantal
    public String solutionOne(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix.isEmpty()) {
                return "";
            }

        }
        return prefix;
    }


}
