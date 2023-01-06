package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class X2Test {

    @Test
    public void calc() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 0;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);

    }
}