package com.rak.dsa.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckingTest {
    PalindromeChecking palindromeChecking;
    @BeforeEach
    void setUp() {
         palindromeChecking = new PalindromeChecking();
    }

    @Test
    void isPalindrome() {
        assertThat(palindromeChecking.isPalindrome("a")).isTrue();
        assertThat(palindromeChecking.isPalindrome("madam")).isTrue();
        assertThat(palindromeChecking.isPalindrome("abba")).isTrue();
        assertThat(palindromeChecking.isPalindrome("udacity")).isFalse();
    }
}