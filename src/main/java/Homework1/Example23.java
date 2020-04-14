package Homework1;

import static java.lang.Math.*;

public class Example23 {
    public static void main(String[] args) {
        int x = 10;
        double Pi = 3.14, y;
        y = acos(atan((5 * x) / Pi)) + pow(x, 5.7) / 23;
        System.out.println(y);
    }
}
