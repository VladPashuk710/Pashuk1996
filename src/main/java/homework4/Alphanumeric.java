package homework4;

import java.util.Random;

public class Alphanumeric {
    public static void main(String[] args) {
    }

    public static String randomString(String type, int length) {
        String alphabet = "";
        if ("alpha".equals(type)) {
            alphabet = "abcdefghigklmnopqrstuvwxyz";
        } else if ("numeric".equals(type)) {
            alphabet = "1234567890";
        } else if ("alphanumeric".equals(type)) {
            alphabet = "abcdefghigklmnopqrstuvwxyz1234567890";
        } else {
            return "ERROR";
        }
        String result = "";
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            char c = alphabet.charAt(rand.nextInt(alphabet.length()));
            result += c;
            System.out.println(result);
        }
        return result;
    }
}




