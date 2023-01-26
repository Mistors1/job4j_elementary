package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void max() {
        int result = Max.max(8, 9);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testMax() {
        int result = Max.max(0, 8, 5);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testMax1() {
        int result = Max.max(6, 4, 6, 4);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}