package org.code.challenges.leetcode.topInterview150.easy;

import java.net.Inet4Address;

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

    public static String solution2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int minLen = Integer.MAX_VALUE;

        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private static boolean isCommonPrefix(String[] strs, int len) {
        String str1 = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(str1)) {
                return false;
            }
        } return true;
    }

}
