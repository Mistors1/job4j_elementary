package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float rubleE = 258;
        float rubleD = 4283;
        float euro = rubleToEuro(rubleE);
        float dollar = rubleToDollar(rubleD);

        System.out.println(rubleE + " ruble = " + euro + " euro.");
        System.out.println(rubleD + " ruble = " + dollar + " dollar.");

    }
}
