package homework3;

public class MyTask1 {
    public static void main(String[] args) {
        int Number[] = new int[]{7, 15, 20, 50, 100};
        int min = getMin(Number);
        System.out.println("Minimal Value is: " + min);
    }

    public static int getMin(int[] inputNumber) {
        int minValue = inputNumber[0];
        for (int i = 1; i < inputNumber.length; i++) {
            if (inputNumber[i] < minValue) {
                minValue = inputNumber[i];
            }
        }
        return minValue;
    }
}


