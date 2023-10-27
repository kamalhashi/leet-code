package org.code.challenges.leetcode.arrays.easy.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/merge-sorted-array/
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

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;

        for (int p = m + n - 1; p >= 0; p--) {
            if (p2 < 0) {
                break;
            }

            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1--];
            } else {
                nums1[p] = nums2[p2--];
            }

        }
        return nums1;
    }

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(MergeSortedArray.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{3, 5, 6}, 3)));
        System.out.println(MergeSortedArray.combine(new int[]{1, 2, 3, 9}, new int[]{2, 5, 6}));


    }

}
