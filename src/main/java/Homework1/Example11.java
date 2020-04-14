package Homework1;

import static java.lang.Math.*;

class Example11 {
    public static void main(String[] args) {
        int x = 10;
        double Pi = 3.14, y;
        y = 2 * Pi * x - abs(sin(Math.sqrt(10.5 * x))) * (1 / pow(Math.sqrt(pow(x, 2)), 3) + 1 / 7);
        System.out.println(y);
    }
}