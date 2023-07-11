package org.code.challenges.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {

    public static List<Integer> combine(int[] arr1, int[] arr2) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans.add(arr1[i]);
                i++;
            } else {
                ans.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            ans.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            ans.add(arr2[j]);
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(MergeSortedArray.combine(new int[]{1, 4, 7, 20}, new int[]{3, 5, 6}));
        System.out.println(MergeSortedArray.combine(new int[]{1,2,3,0,0,0}, new int[]{2,5,6}));

    }

}
