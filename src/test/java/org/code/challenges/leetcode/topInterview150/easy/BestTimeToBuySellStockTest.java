package org.code.challenges.leetcode.topInterview150.easy;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BestTimeToBuySellStockTest {

    @Test
    void solution1() {
        int result = BestTimeToBuySellStock.solution1(new int[]{7, 1, 5, 3, 6, 4});
        assertThat(result).isEqualTo(5);
    }

    @Test
    void solution2() {
        int result = BestTimeToBuySellStock.solution2(new int[]{7, 1, 5, 3, 6, 4});
        assertThat(result).isEqualTo(5);
    }
}