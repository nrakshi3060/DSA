package com.rak.dsa.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinimumBracketReversalTest {
    MinimumBracketReversal minimumBracketReversal;

    @BeforeEach
    void setUp() {
        minimumBracketReversal = new MinimumBracketReversal();
    }

    @Test
    void countMinimumBracketReversal() {
        assertThat(minimumBracketReversal.countMinimumBracketReversal("}}}}")).isEqualTo(2);
        assertThat(minimumBracketReversal.countMinimumBracketReversal("}}{{")).isEqualTo(2);
        assertThat(minimumBracketReversal.countMinimumBracketReversal("{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{}}}}}")).isEqualTo(13);
        assertThat(minimumBracketReversal.countMinimumBracketReversal("}}{}{}{}{}{}{}{}{}{}{}{}{}{}{}")).isEqualTo(1);
    }
}