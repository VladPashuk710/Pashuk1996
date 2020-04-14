package Homework1;

import static java.lang.Math.*;

class Example15 {
    public static void main(String[] args) {
        int x = 10;
        double y;
        y = (abs(x * Math.log(x) - 4) * sqrt(x)) * (1 / (pow(sqrt(pow(E, (4 * x) - 1)), 5)));
        System.out.println(y);
    }
}