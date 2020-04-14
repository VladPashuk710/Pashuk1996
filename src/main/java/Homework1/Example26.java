package Homework1;

import static java.lang.Math.*;

public class Example26 {
    public static void main(String[] args) {
        int x = 10;
        double y;
        y = Math.log(abs(sin(x))) + 2 * pow(E, x) + 2 * cos(abs(x)) + 2;
        System.out.println(y);
    }
}