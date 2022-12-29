package ru.job4j;

public class Echo {
    public static void plus(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Echo.plus(100, 500);
        Echo.plus(4, 2);
        Echo.plus(3, 5);
    }

}
