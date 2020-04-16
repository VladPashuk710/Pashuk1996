package Homework7_part1;

public class ConfigurationManager {
    public static void main(String[] args) {
        System.out.println(System.getenv("url"));
        System.out.println(System.getenv("numberOfThreads"));
        System.out.println(System.getenv("runTime"));
    }
}
