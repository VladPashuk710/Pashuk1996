package Homework1;

import static java.lang.Math.*;

class Example14 {
    public static void main(String[] args) {
        int x = 10;
        double y;
        y = (Math.sqrt(pow(sin(x / 2), 3) + (pow(Math.sqrt(pow(E, 1.3 * x)), 3) + pow(E, (-1.3) * x))) * (1 / abs(x + 5 / 2)));
        System.out.println(y);
    }
}
