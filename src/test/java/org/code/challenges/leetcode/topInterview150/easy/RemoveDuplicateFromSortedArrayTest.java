package org.code.challenges.leetcode.topInterview150.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RemoveDuplicateFromSortedArrayTest {

    @Test
    public void testSolution1() {

        int duplicates = RemoveDuplicateFromSortedArray.solution1(new int[]{1, 2, 3, 3, 4, 4, 6});
        assertThat(duplicates).isEqualTo(5);
    }
}