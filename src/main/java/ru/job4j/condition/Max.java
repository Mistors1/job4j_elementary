package ru.job4j.condition;

public class Max {
    public static int max(int a, int b, int c) {
        int max = a > b ? a : b;
        int result = max > c ? max : c;
        return result;
    }

    public static void main(String[] args) {
        int result = max(10, 4, 9);
        System.out.println(result);
    }
}
