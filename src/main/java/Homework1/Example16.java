package Homework1;

import static java.lang.Math.*;

class Example16 {
    public static void main(String[] args) {
        int x = 10;
        double y;
        y = pow(Math.sqrt(pow(E, 2 * x)), 3) * Math.sqrt(x) - (((x + 1) / 3) / x) * abs(cos(2.5 * x));
        System.out.println(y);
    }
}
