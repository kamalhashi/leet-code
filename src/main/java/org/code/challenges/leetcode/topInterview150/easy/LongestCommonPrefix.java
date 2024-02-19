package org.code.challenges.leetcode.topInterview150.easy;

public class LongestCommonPrefix {

    //Horizontal scan
    public static String solution1(String[] strs) {
        //Horizontal scan
        if (strs.length == 0) {
            return "";
        }

        //Taking the first item as prefix
        String prefix = strs[0];

        //Loop through all the items in the list
        for (int index = 1; index < strs.length; index++) {

            while (strs[index].indexOf(prefix) != 0) {

                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isBlank()) {
                    return "";
                }
            }
        }
        return prefix;
    }

}
