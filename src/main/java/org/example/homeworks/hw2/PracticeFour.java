package org.example.homeworks.hw2;

public class PracticeFour {
    public static void main(String[] args) {
        int age = 24;
        if (age <= 12) {
            System.out.println("You are a kid");
        }
        if (age > 13 && age <= 17) {
            System.out.println("You are a teenager");
        }
        if (age >= 18 && age <= 64) {
            System.out.println("You are an adult");
        }
        if (age >= 65) {
            System.out.println("You are an elderly");
        }
    }
}
