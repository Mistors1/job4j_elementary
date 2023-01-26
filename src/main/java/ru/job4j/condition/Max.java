package ru.job4j.condition;

public class Max {

    public static int max(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }

    public static int max(int a, int b, int c) {
        int max = max(a, b);
        return max(max, c);
    }

    public static int max(int a, int b, int c, int x) {
        int max1 = max(a, b);
        int max2 = max(c, x);
        return max(max1, max2);
    }

    public static void main(String[] args) {
        int result = max(5, 7, 8, 9);
        System.out.println(result);
    }
}
