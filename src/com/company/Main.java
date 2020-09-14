package com.company;

public class Main {

    public static void main(String[] args) {
        double[] num = {-1.2, -1.3, 1.4, -1.5, 1.6, -1.7, 1.8, -1.9, 2.1, -2.2, 2.3, -2.4, 2.5, -2.6, 2.7};
        double sum = 0;
        for (double x : num) {
            if (x > 0)
                sum += x;
        }
        char a = ';';
        System.out.println("Среднее арифметическое число равно: " + sum / 7 + a);
    }
}
