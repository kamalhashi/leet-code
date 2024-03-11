package org.code.challenges.leetcode.hashing.easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @Test
    public void isHappy(){
       var result= HappyNumber.isHappy(25);
        Assertions.assertThat(result).isEqualTo(false);
    }

}