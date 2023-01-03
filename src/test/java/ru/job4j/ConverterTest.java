package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void  rubleToEuro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void rubleToDollar() {
        float in = 4283;
        float expected = 71.38F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}