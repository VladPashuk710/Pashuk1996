package Homework1;

import static java.lang.Math.*;

public class Example22 {
    public static void main(String[] args) {
        int x = 10;
        double y;
        y = asin(log10(x) / (pow(x, 2) + 5 * x + 1)) - pow(x, 3.2) / 28;
        System.out.println(y);
    }
}
