package ru.job4j;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double s = Math.sqrt((a + b + c) / 2 * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
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
