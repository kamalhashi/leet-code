package org.code.challenges.leetcode.hashing.easy;


import java.util.HashSet;
import java.util.Set;

//202. https://leetcode.com/problems/happy-number/description/
public class HappyNumber {


    public static  boolean isHappy(int n) {
        Set<Integer> visit = new HashSet<Integer>();
        // compute square until getting duplicate value
        while (!visit.contains(n)) {
            visit.add(n);
            // using helper function to compute the sum of squares
            n = sumOfSquare(n);

            if (n == 1) return true;
        }
        return false;
    }

    public static int sumOfSquare(int n) {
        int output = 0;

        while (n != 0) {
            int digit = n % 10;
            digit = digit * digit;
            output += digit;
            n = n / 10;
        }

        return output;
    }

    public static  void main(String[] args){
        int number=10;
        System.out.println(number % 8);

        System.out.println(number / 10);
    }

}
