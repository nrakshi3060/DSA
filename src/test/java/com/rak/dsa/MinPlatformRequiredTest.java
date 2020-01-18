package com.rak.dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinPlatformRequiredTest {
    MinPlatformRequired minPlatformRequired;

    @BeforeEach
    void setUp() {
        minPlatformRequired = new MinPlatformRequired();
    }

    @Test
    void minPlatformsNeeded() {
        int[] arrival = new int[]{900,  940, 950,  1100, 1500, 1800};
        int[] arrival1 = new int[]{200, 210, 300, 320, 350, 500};
        int[] departure = new int[]{910, 1200, 1120, 1130, 1900, 2000};
        int[] departure1 = new int[]{230, 340, 320, 430, 400, 520};
        assertThat(minPlatformRequired.minPlatformsNeeded(arrival, departure)).isEqualTo(3);
        assertThat(minPlatformRequired.minPlatformsNeeded(arrival1, departure1)).isEqualTo(2);
    }
}