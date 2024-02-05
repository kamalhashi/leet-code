package org.code.challenges.leetcode.arrays.easy.twopointers;


//Approach 1: Using Two Pointers
//https://leetcode.com/problems/reverse-words-in-a-string-iii

/**
 * N = Length of the string s.
 * Time Complexity: O(N) The outer loop iterates over N characters to find the start
 * and end index of every word. The algorithm to reverse the word also iterates N times to perform N/2 swaps.
 * Thus, the time complexity is O(N+N)=O(N).
 */
public class ReverseWordsInAStringIII_TwoPointers {

    public static String reverseWords(String s) {
        int lastSpaceIndex = -1;
        int len = s.length();
        char[] chArray = s.toCharArray();

        for (int strIndex = 0; strIndex <= len; strIndex++) {
            if (strIndex == len || s.charAt(strIndex) == ' ') {
                int startIndex = lastSpaceIndex + 1;
                int endIndex = strIndex - 1;

                while (startIndex < endIndex) {
                    char temp = chArray[startIndex];
                    chArray[startIndex] = chArray[endIndex];
                    chArray[endIndex] = temp;
                    startIndex++;
                    endIndex--;
                }
               lastSpaceIndex = strIndex;
            }
        }
        return new String(chArray);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Kamal Hashi Ali"));
    }
}
