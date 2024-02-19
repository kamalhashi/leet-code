package org.code.challenges.leetcode.topInterview150.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

    @Test
    void solution1() {
        String[] strs = {"flower", "flow", "flight"};
        String result = LongestCommonPrefix.solution1(strs);
        Assertions.assertThat(result).isEqualTo("fl");
    }

    @Test
    void solution2() {
        String[] strs = {"flower", "flow", "flight"};
        String result = LongestCommonPrefix.solution2(strs);
        Assertions.assertThat(result).isEqualTo("fl");
    }
}