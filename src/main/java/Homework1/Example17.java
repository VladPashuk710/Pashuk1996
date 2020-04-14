package Homework1;

import static java.lang.Math.*;

class Example17 {
    public static void main(String[] args) {
        int x = 10;
        double y;
        y = pow(x, 3) / 3 - pow(E, x) * Math.log(abs(pow(1.3, 3) + pow(x, 3) + 4 / 3));
        System.out.println(y);
    }
}