import java.util.Scanner;

public class SubstringComparison{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        // Create substring using charAt()
        String manualSub = "";
        for (int i = start; i < end; i++) {
            manualSub = manualSub + text.charAt(i);
        }

        // Create substring using .substring()
        String builtInSub = text.substring(start, end);

        boolean isSame = true;
        if (manualSub.length() != builtInSub.length()) {
            isSame = false;
        } else {
            for (int i = 0; i < manualSub.length(); i++) {
                if (manualSub.charAt(i) != builtInSub.charAt(i)) {
                    isSame = false;
                    break;
                }
            }
        }
        //Printing the Result
        System.out.println("Substring using charAt(): " + manualSub);
        System.out.println("Substring using substring(): " + builtInSub);
        System.out.println("Are both substrings equal? " + isSame);
    }
}
