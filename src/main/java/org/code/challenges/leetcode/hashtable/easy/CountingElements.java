package org.code.challenges.leetcode.hashtable.easy;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public static int countElements(int[] arr) {
        int count = 0;
        Set<Integer> st = new HashSet<>();
        for (int num : arr)
            st.add(num);

        for (int j : arr) {
            if (st.contains(j + 1))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countElements(new int[]{1,2,3}));
        System.out.println(countElements(new int[]{1,1,3,3,5,5,7,7}));

    }
}
