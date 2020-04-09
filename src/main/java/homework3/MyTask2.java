package homework3;

public class MyTask2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("no data");
        } else {
            System.out.println(isPalindrome(args[0]));
        }
    }

    private static boolean isPalindrome(String data) {
        data = data.replace(" ", "");
        data = data.toLowerCase();
        int dataLen = data.length();
        for (int i = 0; i < dataLen / 2; i++)
            if (data.charAt(i) != data.charAt(dataLen - i - 1))
                return false;
        return true;
    }
}