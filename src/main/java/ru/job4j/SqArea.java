package ru.job4j;

public class SqArea {
    public static double square(double p, double k) {
        double rsl = (p / (2 * (k + 1))) * ((p / (2 * (k + 1))) * k);
        return rsl;
    }

    public static void main(String[] args) {
        double p = 6;
        double k = 2;
        double result1 = square(p, k);
        System.out.println("p = " + p + ", k = " + k + ", s = " + result1);
    }
}
