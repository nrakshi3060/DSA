package com.rak.dsa.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WordFlipperTest {
    private WordFlipper wordFlipper;

    @BeforeEach
    void setUp() {
        wordFlipper = new WordFlipper();
    }

    @Test
    void wordFlipper() {
        assertThat(wordFlipper.wordFlipper("retaw")).isEqualTo("water");
        assertThat(wordFlipper.wordFlipper("sihT si na elpmaxe")).isEqualTo("This is an example");
        assertThat(wordFlipper.wordFlipper("sihT si eno llams pets rof ...")).isEqualTo("This is one small step for ...");
    }
}