package org.code.challenges.leetcode.coin;

import java.util.Scanner;

public class MoneyBreakdown {
    public static void main(String[] args) {

        final int TENS_VAL = 10, FIVE_VAL = 5, ONES_VAL = 1;
        final float QUARTER_VAL = 0.25f, DIME_VAL = 0.10F, NIC_VAL = .05F, PENNY = .01F;
        float amount, runningAmount;
        int tens, fives, ones;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter monetary amount:");
        amount = scan.nextFloat();

        runningAmount = amount;
        tens = (int) runningAmount / TENS_VAL;
        runningAmount = runningAmount % TENS_VAL;


        System.out.format("You entered $ %.2f\n:", amount);
        System.out.printf("%d ten dollar bill.\n:", tens);
        System.out.println(runningAmount);



    }
}
