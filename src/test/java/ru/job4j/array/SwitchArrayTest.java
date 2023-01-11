package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap4to1() {
        int[] input = {4, 5, 1, 6, 6, 0};
        int source = 4;
        int dest = 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 6, 1, 6, 5, 0};
        assertThat(result).containsExactly(expected);
    }
}