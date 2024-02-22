package org.code.challenges.leetcode.topInterview150.easy;

public class RansomNote {

    public static boolean solution1(String ransomNote, String magazine) {

        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            int matchingIndex = magazine.indexOf(r);

            if (matchingIndex == -1) {
                return false;
            }
            magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);

        }
        return true;
    }

}
