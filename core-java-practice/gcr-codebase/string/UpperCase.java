import java.util.Scanner;

public class UpperCase {

    //Convert lowercase to uppercase using charAt() and ASCII logic
    public static String manualToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result = result + ch;
        }
        return result;
    }

    //Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String manualUpper = manualToUpperCase(text);
        String builtInUpper = text.toUpperCase();
        boolean result = compareStrings(manualUpper, builtInUpper);//Checking if both the Strings are equal or not
        //Checking and printing the Strings with result
        System.out.println("Manual Uppercase : " + manualUpper);
        System.out.println("Built-in Uppercase : " + builtInUpper);
        System.out.println("Are both strings equal? " + result);
    }
}
