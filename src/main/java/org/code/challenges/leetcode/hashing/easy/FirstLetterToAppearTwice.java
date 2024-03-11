package org.code.challenges.leetcode.hashing.easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/first-letter-to-appear-twice/
public class FirstLetterToAppearTwice {
    public static char repeatedCharacter_Set(String s) {
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (seen.contains(s.charAt(i)))
                return s.charAt(i);
            seen.add(s.charAt(i));
        }

        return ' ';
    }

    public static char repeatedCharacter_BruteForce(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < i; j++) {
                if (c == s.charAt(j))
                    return c;

            }
        }
        return ' ';
    }


    public static void main(String[] args) {
        System.out.println(repeatedCharacter_BruteForce("abccbaacz"));
        System.out.println(repeatedCharacter_Set("abcdd"));

    }
}
