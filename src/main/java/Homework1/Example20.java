package Homework1;

import static java.lang.Math.*;

public class Example20 {
    public static void main(String[] args) {
        int x = 10;
        double y, Pi = 3.14;
        y = (pow(Math.sqrt(log(pow(x, 2))), 3) + atan(cos(Pi * x)) * abs(log(x / 10.5) + 1 / 3));
        System.out.println(y);
    }
}