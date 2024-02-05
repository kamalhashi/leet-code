package org.code.challenges.leetcode.coin;

public class CoinChangeNumberOfCombination {
    public static int change(int amount, int[] coins) {
        int[] combinations = new int[amount + 1];
        combinations[0] = 1;
        for (int coin : coins) {
            for (int i = 1; i < combinations.length; i++) {
                if (i >= coin) {
                    combinations[i] += combinations[i - coin];
                    printAmount(combinations);
                }
            }
            System.out.println();
        }
        return combinations[amount];
    }

    public static void printAmount(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a= ('g' - 'a');
        System.out.println(a);

        System.out.println(change(5, new int[]{1, 2, 5}));

    }
}
