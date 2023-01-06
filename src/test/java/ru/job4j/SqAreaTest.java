package ru.job4j;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void square() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}