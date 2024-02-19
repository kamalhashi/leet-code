package org.code.challenges.leetcode.topInterview150.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RemoveDuplicateFromSortedArrayIITest {

    @Test
    void solution1() {
        int result = RemoveDuplicateFromSortedArrayII.solution1(new int[]{1, 1, 1, 2, 2, 3});
        assertThat(result).isEqualTo(5);
    }

    @Test
    void solution2() {
        int result= 1;
        assertThat(result++).isEqualTo(1);
        assertThat(result).isEqualTo(2);

    }
}