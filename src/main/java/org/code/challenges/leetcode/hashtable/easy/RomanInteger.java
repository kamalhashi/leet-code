package org.code.challenges.leetcode.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }

        return result;
    }


    public static int romanToIntSolution2(String s) {
        int sum = 0;
        int curr = translate(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int next = translate(s.charAt(i));

            if (curr < next) {
                sum -= curr;
            } else {
                sum += curr;
            }

            curr = next;
        }

        sum += curr;

        return sum;
    }


    private static int translate(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        var x = 2;
        x -= 10;
        System.out.println(x);
        System.out.println(romanToIntSolution2("IX"));

    }
}
