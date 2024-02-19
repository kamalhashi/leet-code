package org.code.challenges.leetcode.topInterview150.easy;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MajorityElementTest {

    @Test
    void solution1Case1() {
        int result = MajorityElement.solution1(new int[]{3, 2, 3});
        assertThat(result).isEqualTo(3);
    }

    @Test
    void solution1Case2() {
        int result = MajorityElement.solution2(new int[]{2,2,1,1,1,2,2});
        assertThat(result).isEqualTo(2);
    }
}