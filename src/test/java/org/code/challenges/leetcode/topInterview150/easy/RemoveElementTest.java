package org.code.challenges.leetcode.topInterview150.easy;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RemoveElementTest {

    @Test
    void testRemoveElementSolutionOne() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = RemoveElement.solution1(nums, val);
        assertThat(result).isEqualTo(2);
    }

}