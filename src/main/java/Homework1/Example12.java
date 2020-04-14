package Homework1;

import static java.lang.Math.*;

class Example12 {
    public static void main(String[] args) {
        int x = 10;
        double y;
        y = Math.log(Math.sqrt(abs(2 - x)) + 1.2) * (1 / (2 + pow(E, (-x)))) + (pow(Math.sqrt(2 / x), 3));
        System.out.println(y);
    }
}
