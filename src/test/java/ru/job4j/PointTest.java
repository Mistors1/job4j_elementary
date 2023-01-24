package ru.job4j;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void distance() {
        double expected = 55.22;
        Point a = new Point(58, 7);
        Point b = new Point(3, 12);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}