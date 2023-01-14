package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[]{6, 8, 9, 5, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{5, 6, 7, 8, 9};
        assertThat(result).containsExactly(expected);
    }
}