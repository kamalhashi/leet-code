package org.code.challenges.leetcode.arrays.easy;


//Approach 1: Traverse and Reverse each character one by one
//https://leetcode.com/problems/reverse-words-in-a-string-iii

/**
 * N = Length of the string s.
 * Time Complexity: O(N) Every character in the string is traversed twice. First,
 * to find the end of the current word, and second to reverse the word and append it to the result.
 * Thus the time complexity is, is O(N+N)=O(N).
 */
public class ReverseWordsInAStringIII_TraverseReverse {

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int lastSpaceIndex = -1;
        for (int strIndex = 0; strIndex < s.length(); strIndex++) {
            if ((strIndex == s.length() - 1) || s.charAt(strIndex) == ' ') {
                int reverseStrIndex = (strIndex == s.length() - 1) ? strIndex : strIndex - 1;

                while (reverseStrIndex > lastSpaceIndex) {
                    result.append(s.charAt(reverseStrIndex));
                    reverseStrIndex--;
                }
                if (strIndex != s.length() - 1) {
                    result.append(' ');
                }
                lastSpaceIndex = strIndex;
            }
        }
        return new String(result);
    }


    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
