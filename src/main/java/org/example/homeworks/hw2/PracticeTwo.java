package org.example.homeworks.hw2;

public class PracticeTwo {
    public static void main(String[] args) {
        int weight = 85;
        double height = 1.75, bmi;
        bmi = weight / Math.pow(height, 2);
        System.out.println("bmi= " + bmi);
        if (bmi <= 18.5) {
            System.out.println("Underweight");
        }
        if (bmi <= 25.0) {
            System.out.println("Normal");
        }
        if (bmi <= 30.0) {
            System.out.println("Overweight");
        }
        if (bmi <= 30) {
            System.out.println("Obese");
        }
    }
}
