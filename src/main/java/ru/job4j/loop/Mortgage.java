package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        amount = (amount * (1 + (percent / 100)));
        while (salary < amount) {
            year += 1;
            amount = (amount * (1 + (percent / 100))) - salary;
        }
        return year;
    }
}
