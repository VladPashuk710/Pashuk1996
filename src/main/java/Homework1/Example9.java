package Homework1;

import static java.lang.Math.*;

class Example9 {
    public static void main(String[] args) {
        int x = 10;
        double Pi = 3.14, y;
        y = 1.1 * pow(E, (-x)) + abs(cos(Math.sqrt(Pi * x))) - 3 / 8;
        System.out.println(y);
    }
}
