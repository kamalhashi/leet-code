package org.code.challenges.leetcode.coin;

import java.util.Arrays;

public class GreedySolution {

    // driver function
    public static void main(String[] args) {
       float amount = 11.75f;
        countCurrency(amount);



    }

    // function to count and
    // print currency notes
    public static void countCurrency(float amount) {
        float[] notes = new float[]{2000, 500, 200, 100, 50, 20, 10, 1};
        float[] noteCounter = new float[notes.length];

        // count notes using Greedy approach
        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < 8; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i] + "\n");
            }
        }

    }
}
