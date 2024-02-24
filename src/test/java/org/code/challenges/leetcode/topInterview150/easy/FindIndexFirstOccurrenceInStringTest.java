package org.code.challenges.leetcode.topInterview150.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FindIndexFirstOccurrenceInStringTest {

    @Test
    void solution1() {
        int result = FindIndexFirstOccurrenceInString.solution1("leetcode", "code");
        assertThat(result).isEqualTo(4);

    }
}