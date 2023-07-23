package org.code.challenges.leetcode.recursive;

// O(Log n) Time Complexity,
public class LogN {

    // O(Log n) Func , n = 8 Log base 2 of 8 = 3
    public static double logFunc(double n) {
        if (n == 0)
            return n;
        System.out.println("n=" + n);
        n = Math.floor(n / 2);
        return logFunc(n);
    }

    public static void main(String args[]) {
        System.out.println(logFunc(8));
    }
}
