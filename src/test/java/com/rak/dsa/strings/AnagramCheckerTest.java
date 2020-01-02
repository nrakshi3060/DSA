package com.rak.dsa.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {
    private AnagramChecker anagramChecker;

    @BeforeEach
    void setUp() {
        anagramChecker = new AnagramChecker();
    }

    @Test
    void isAnagram() {
       assertThat(anagramChecker.isAnagram("water","waiter")).isFalse();
       assertThat(anagramChecker.isAnagram("Dormitory","Dirty room")).isTrue();
       assertThat(anagramChecker.isAnagram("Slot machines","Cash lost in me")).isTrue();
       assertThat(anagramChecker.isAnagram("A gentleman","Elegant men")).isFalse();
       assertThat(anagramChecker.isAnagram("Time and tide wait for no man","Notified madman into water")).isTrue();
    }
}