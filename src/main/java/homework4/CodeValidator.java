package homework4;

public class CodeValidator {
    public static void main(String[] args) {
        String code = "AX6BYU56UX6CV6BNT7NM 287430";
        String parts[] = code.split(" ");
        int checkSum = Integer.valueOf(parts[1]);
        String strNumbers = parts[0].replaceAll("\\D", "");
        System.out.println(strNumbers);
        int result = 1;
        for (int i = 0; i < 5; i += 2)
            result *= Integer.valueOf(strNumbers.substring(i, 2 + i));
        System.out.println(result);
    }
}
