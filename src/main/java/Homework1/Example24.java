package Homework1;

import static java.lang.Math.*;

public class Example24 {
    public static void main(String[] args) {
        int x = 10;
        double y;
        y = atan((abs(8.3 - 21 * pow(x, 2) - 0.8 * x)) / pow(Math.sqrt(2.5 + 1 / pow(x, 2)), 3));
        System.out.println(y);
    }
}