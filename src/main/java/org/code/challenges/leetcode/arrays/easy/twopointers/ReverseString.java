package org.code.challenges.leetcode.arrays.easy.twopointers;


public class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c'};
        ReverseString.reverseString(ch);
        System.out.println(ch);
    }
}
