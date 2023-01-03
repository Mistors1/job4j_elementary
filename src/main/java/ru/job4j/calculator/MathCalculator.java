package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double a, double b) {
        double sumAndMultiply = sum(a, b) + multiply(a, b);
        return sumAndMultiply;
    }

    public static double minusAndDivied(double a, double b) {
        double minusAndDivied = minus(a, b) + divide(a, b);
        return minusAndDivied;
    }

    public static double sumOfAll(double a, double b) {
        double sumOfAll = sum(a, b) + multiply(a, b) + minus(a, b) + divide(a, b);
        return sumOfAll;
    }

    public static void main(String[] args) {
        System.out.println("Результат = " + sumAndMultiply(15, 10));
        System.out.println("Результат = " + minusAndDivied(15, 10));
        System.out.println("Результат = " + sumOfAll(15, 10));
    }
}
