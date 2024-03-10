package org.code.challenges.leetcode.hashtable.easy;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//3005 Count Elements With Maximum Frequency
public class MaxFrequencyElement {

    public static int solution(int[] nums) {
        //Find the frequency of each element
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }

        //Determine the maximum frequency
        int maxFrequency = 0;
        for (int frequency : frequencies.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        //Calculate the total frequencies of elements with the maximum frequency
        int frequencyOfMaxFrequency = 0;
        
        for (int frequency : frequencies.values()) {
            if (frequency == maxFrequency) {
                frequencyOfMaxFrequency++;
            }
        }

        return frequencyOfMaxFrequency * maxFrequency;
    }
}
