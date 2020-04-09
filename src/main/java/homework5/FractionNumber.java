package homework5;

public class FractionNumber {
    public static void main(String[] args) {
        int num1 = 3, num2 = 7;
        FractionNumber fraction = new FractionNumber();
        fraction.multiply(num1, num2);
        fraction.devide(num1, num2);
        fraction.plus(num1, num2);
        fraction.minus(num1, num2);
    }

    private void devide(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    private void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    private void plus(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    private void minus(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}



