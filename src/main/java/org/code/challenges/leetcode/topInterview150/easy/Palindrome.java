package org.code.challenges.leetcode.topInterview150.easy;

public class Palindrome {
    //compare with reverse
    public static boolean solution1(String s) {
        StringBuilder builder = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                builder.append(Character.toLowerCase(ch));
            }
        }
        String filteredString = builder.toString();
        String reverseString = builder.reverse().toString();
        return filteredString.equals(reverseString);
    }

    //java 8 streams
    public static boolean solution2(String s) {
        StringBuilder builder = new StringBuilder();
        s.chars().filter(Character::isLetterOrDigit).map(Character::toLowerCase).forEach(builder::append);
        return builder.toString().contentEquals(builder.reverse());

    }

    public static boolean solution3(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
        }

        return true;
    }

}
