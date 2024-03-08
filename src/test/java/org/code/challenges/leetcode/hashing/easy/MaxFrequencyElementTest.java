package org.code.challenges.leetcode.hashing.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxFrequencyElementTest {

    @Test
    public void testSolutionOne(){
        var result = MaxFrequencyElement.solution(new int[]{1,2,2,3, 1,4});
        Assertions.assertThat(result).isEqualTo(4);
    }

}