package org.code.challenges.leetcode.coin;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ChangeTenderedWorking {


    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the purchase price: ");
        BigDecimal price = scan.nextBigDecimal();
        System.out.println("Enter the amount paid: ");
        BigDecimal amountPayed = scan.nextBigDecimal();
        Map<Denomination, Integer> changeDue = getDenomination(amountPayed, price);

        for(Denomination denomination : changeDue.keySet()) {
            System.out.println("Return " + denomination + " bill(s) : "+ changeDue.get(denomination));
        }
        scan.close();
    }


    public static Map<Denomination, Integer> getDenomination(BigDecimal amountPayed, BigDecimal price) {
        BigDecimal change = amountPayed.subtract(price);
        System.out.println("Return change -- "+ change);
        Map<Denomination, Integer> changeReturn = new LinkedHashMap<>();
        for(Denomination denomination : Denomination.values()) {

            BigDecimal[] values = change.divideAndRemainder(denomination.value, MathContext.DECIMAL32);
            if(!values[0].equals(BigDecimal.valueOf(0.0)) && !values[1].equals(BigDecimal.valueOf(0.0))) {
                changeReturn.put(denomination, values[0].intValue());
                change = values [1];
            }

        }
        return changeReturn;
    }



     enum Denomination {
        HUNDRED(BigDecimal.valueOf(100)),
        FIFTY(BigDecimal.valueOf(50)),
        TWENTY(BigDecimal.valueOf(20)),
        TEN(BigDecimal.valueOf(10)),
        FIVE(BigDecimal.valueOf(5)),
        TWO(BigDecimal.valueOf(2)),
        ONE(BigDecimal.valueOf(1)),
        QUARTER(BigDecimal.valueOf(0.25)),
        DIME(BigDecimal.valueOf(0.10)),
        NICKEL(BigDecimal.valueOf(0.5)),
        PENNY(BigDecimal.valueOf(0.1));

        private BigDecimal value;

        Denomination(BigDecimal value) {
            this.value = value;
        }
    }


}
