package org.code.challenges.leetcode.arrays.easy.twopointers;

//https://leetcode.com/problems/valid-palindrome/
//Palindrome
public class Palindrome {

    public static boolean checkIfPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome.checkIfPalindrome("racecar");
        Palindrome.checkIfPalindrome("abcdcba");

    }

    //https://leetcode.com/problems/two-sum/
    public static class TwoSum {
        public static boolean checkForTarget(int[] nums, int target) {

            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                int current = nums[left] + nums[right];

                if (current == target) {
                    return true;
                }

                if (current > target) {
                    right--;
                } else {
                    left++;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            System.out.println("checkForTarget:" + TwoSum.checkForTarget(new int[]{3, 6, 21, 23, 25}, 27));
        }
    }
}
