class PalindromeChecker {
    private String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if text is palindrome
    public boolean isPalindrome() {
        // Remove spaces and convert to lowercase
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = cleanedText.length() - 1;

        while (start < end) {
            if (cleanedText.charAt(start) != cleanedText.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method to display result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }
}

public class Palindrome {
    public static void main(String[] args) {

        PalindromeChecker p1 = new PalindromeChecker("A man a plan a canal Panama");
        PalindromeChecker p2 = new PalindromeChecker("Hello");

        p1.displayResult();
        p2.displayResult();
    }
}
