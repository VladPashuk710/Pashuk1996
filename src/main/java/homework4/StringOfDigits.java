package homework4;

public class StringOfDigits {
    public static void main(String[] args) {
        String digits = "24367";
        System.out.println(digits);
        String result1, result2, result3, result4, result5;
        result1 = digits.replace("2", "0");
        result2 = digits.replace("4", "0");
        result3 = digits.replace("3", "0");
        result4 = digits.replace("6", "1");
        result5 = digits.replace("7", "1");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
