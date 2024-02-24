package org.code.challenges.leetcode.topInterview150.easy;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {

    @Test
    public void testSolution1() {
        var result = Palindrome.solution1("kamak");
        Assertions.assertThat(result).isEqualTo(result);
    }

    @Test
    public void testSolution2() {
        var result = Palindrome.solution2("kamak");
        Assertions.assertThat(result).isEqualTo(result);
    }

}