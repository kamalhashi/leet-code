package org.code.challenges.leetcode.topInterview150.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RansomNoteTest {
     @Test
     public void solution1(){
         RansomNote.solution1("aba", "aba");
     }

    @Test
    public void solution2(){
        var result = RansomNote.solution2("aa", "ab");
        assertThat(result).isEqualTo(false);

    }

}