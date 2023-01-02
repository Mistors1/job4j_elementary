package ru.job4j;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static void main(String[] args) {
        double a = 5;
        double b = 8;
        double c = 6;
        double s = area(a, b, c);
        System.out.println("area (" + a + ", " + b + ", " + c + ") = " + s);
    }
}
