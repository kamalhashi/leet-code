package org.code.challenges.leetcode.dp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciDPTest {

    @Test
    void fibTopDown() {
       var result=  FibonacciDP.fibTopDown(20000);
        Assertions.assertThat(result).isEqualTo(34);
    }

    @Test
    void fibBottomUp() {
        var result=  FibonacciDP.fibBottomUp(200000);
        Assertions.assertThat(result).isEqualTo(34);
    }
}