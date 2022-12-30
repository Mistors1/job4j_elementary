package ru.job4j;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightM = 176;
        short heightW = 165;
        double man = manWeight(heightM);
        double woman = womanWeight(heightW);

        System.out.println("Man " + heightM + " is " + man);
        System.out.println("Woman " + heightW + " is " + woman);
    }

}
