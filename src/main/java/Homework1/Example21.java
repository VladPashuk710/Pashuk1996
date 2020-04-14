package Homework1;

import static java.lang.Math.*;

public class Example21 {
    public static void main(String[] args) {
        int x = 10;
        double y;
        y = pow(Math.sqrt(log10(10)) + acos(x + 3), 3) * (1 / abs(x + pow(2 * x, 2)));
        System.out.println(y);
    }
}
