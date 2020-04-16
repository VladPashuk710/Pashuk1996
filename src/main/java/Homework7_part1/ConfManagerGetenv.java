package Homework7_part1;

public class ConfManagerGetenv extends ConfigurationManager {
    private ConfManagerGetenv() {
    }

    ConfManagerGetenv env = new ConfManagerGetenv();

    public ConfManagerGetenv getInstance() {
        return env;
    }

    private void getValueOrDefault() {
    }

    public static String getUrl() {
        return "url";
    }

    public static String getNumberOfThreads() {
        return "numberOfThreads";
    }

    public static String getRunTime() {
        return "runTime";
    }
}
