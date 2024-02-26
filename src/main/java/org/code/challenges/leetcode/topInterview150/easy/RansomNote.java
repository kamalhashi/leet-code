package org.code.challenges.leetcode.topInterview150.easy;

import java.util.HashMap;
import java.util.Map;

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

    public static boolean solution2(String ransomNote, String magazine) {

        Map<Character, Integer> magazineLetters = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            magazineLetters.put(c, magazineLetters.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            int currentCount = magazineLetters.get(c);

            if (currentCount == 0) {
                return false;
            }
            magazineLetters.put(c, currentCount - 1);
        }
        return true;
    }

}
