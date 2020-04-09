package homework3;

public class MyTask5 {
    public static void dec(int a) {
        int i, d;
        while (a != 0) {
            d = a * 8;
            System.out.print(d);
            a = a / 10;
        }
    }

    public static void main(String[] args) {
        dec(0001);
    }
}
