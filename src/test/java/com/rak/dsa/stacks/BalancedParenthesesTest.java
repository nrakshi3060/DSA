package com.rak.dsa.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class BalancedParenthesesTest {
    BalancedParentheses balancedParentheses;

    @BeforeEach
    void setUp() {
        balancedParentheses = new BalancedParentheses();
    }

    @Test
    void isBalancedParentheses() {
        assertThat(balancedParentheses.isBalancedParentheses("(")).isFalse();
        assertThat(balancedParentheses.isBalancedParentheses("]")).isFalse();
        assertThat(balancedParentheses.isBalancedParentheses("[{]}")).isFalse();
        assertThat(balancedParentheses.isBalancedParentheses("[({})]")).isTrue();
        assertThat(balancedParentheses.isBalancedParentheses("{} ()")).isTrue();
        assertThat(balancedParentheses.isBalancedParentheses("((3^2 + 8)*(5/2))/(2+6)")).isTrue();
        assertThat(balancedParentheses.isBalancedParentheses("((3^2 + 8)*(5/2))/(2+6))")).isFalse();
    }
}