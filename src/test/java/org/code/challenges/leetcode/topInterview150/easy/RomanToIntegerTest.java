package org.code.challenges.leetcode.topInterview150.easy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

    @Test
    void solution1() {
        int result= RomanToInteger.solution1("III");
        assertThat(result).isEqualTo(3);
    }
}