package org.code.challenges.leetcode.topInterview150.easy;

public class LengthOfLastWord {

    //String index manipulation with two loops
    public static int solution1(String s) {
        int p = s.length() - 1;
        int length = 0;

        while (p >= 0 && s.charAt(p) == ' ') {
            p--;
        }

        while (p >= 0 && s.charAt(p) != ' ') {
            p--;
            length++;
        }
        return length;
    }

    //One loop iteration
    public static int solution2(String s) {
        int p = s.length(), length = 0;
        while (p > 0) {
            p--;
            if (s.charAt(p) != ' ') {
                length++;
            } else if (length > 0) {
                return length;
            }
        }
        return length;
    }

    public static int solution3(String s) {
        s = s.trim();
        int result = s.length() - s.lastIndexOf(" ") - 1;
        return result;

    }
}
