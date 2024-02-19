package org.code.challenges.leetcode.topInterview150.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LengthOfLastWordTest {

    @Test
    public void testSolution1Case1() {
        int length = LengthOfLastWord.solution1("Hello World");
        assertThat(length).isEqualTo(5);
    }

    @Test
    public void testSolution2Case1() {
        int length = LengthOfLastWord.solution2("World  ");
        assertThat(length).isEqualTo(5);
    }


    @Test
    public void testSolution3Case2() {
        int length = LengthOfLastWord.solution3("World  ");
        assertThat(length).isEqualTo(5);
    }

}