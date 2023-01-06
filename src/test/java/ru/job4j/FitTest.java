package ru.job4j;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void manWeight() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        short in = 155;
        double expected = 52;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 1);
    }
}