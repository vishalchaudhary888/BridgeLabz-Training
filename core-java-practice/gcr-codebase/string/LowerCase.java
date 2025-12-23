import java.util.Scanner;

public class LowerCase {
    public static String LowerCaseConverter(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // convert only uppercase letters
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result = result + ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        String result = LowerCaseConverter(Str);
        System.out.println("Manual Lowercase : " + result);
        System.out.println("Built-in Lowercase : " + Str.toLowerCase());
    }
}
