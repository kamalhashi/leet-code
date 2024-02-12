package org.code.challenges.leetcode.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://medium.com/javarevisited/you-dont-know-java-streams-in-practice-do-you-826e6aebba81
public class JavaStreams {

    public static void findEvenSum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().filter(number -> number % 2 == 0).mapToInt(n -> n).sum();
        System.out.println(sum);
    }

    public static void countStringLengthGreaterThan5() {
        List<String> strings = Arrays.asList("apple", "banana", "grape", "watermelon", "kiwi");
        long count = strings.stream().filter(s -> s.length() > 5).count();
        System.out.println(count);

    }

    public static void squareRoot() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream().map(number -> number * number).toList();
        System.out.println(squares);
    }

    public static void largestNumber() {
        List<Integer> numbers = Arrays.asList(10, 5, 25, 15, 30);
        int squares = numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(squares);
    }

    public static void main(String[] args) {
        findEvenSum();
        countStringLengthGreaterThan5();
        squareRoot();
        largestNumber();
    }
}
