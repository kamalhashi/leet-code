package org.code.challenges.leetcode.hashing.easy;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class Pangram {
    public static boolean checkIfPangram_FindLettersOneByOne(String sentence) {
        for (int i = 0; i < 26; i++) {
            char currChar = (char) ('a' + i);
            if (sentence.indexOf(currChar) == -1)
                return false;
        }
        return true;
    }

    public static boolean checkIfPangram_Set(String sentence) {
        Set<Character> seen = new HashSet<>();
        for (char currChar : sentence.toCharArray()) {
            seen.add(currChar);
        }
        return seen.size() == 26;
    }


    public static void main (String[] args){
        System.out.println(checkIfPangram_FindLettersOneByOne("thequickbrownfoxjumpsoverthelazydo["));
        System.out.println(checkIfPangram_FindLettersOneByOne("letcod"));

    }
}
