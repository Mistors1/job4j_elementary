package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import ru.job4j.condition.Point;

public class PointTest {

    @Test
    public void distance() {
        double expected = 55.22;
        Point a = new Point(58, 7);
        Point b = new Point(3, 12);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point a = new Point(73, 22, 32);
        Point b = new Point(12, 4, 21);
        double out = a.distance3d(b);
        double expected = 64.54;
        Assert.assertEquals(expected, out, 0.01);
    }
}