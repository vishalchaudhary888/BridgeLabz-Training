import java.util.Scanner;

public class LongestLetterInText {

    // Method for finding the maximum and minimum length of word in a text
    public static void maxCount(char[] Array) {

        int Count = 0;          // It is a temporary counter to count letters of a word
        int Max_Count = 0;      // It will store the longest word length
        int Min_Count = Array.length; // It will store the smallest word length

        for (int i = 0; i < Array.length; i++) {

            // Checking space which indicates end of a word
            if (Array[i] == ' ') {

                // Updating maximum length
                if (Count > Max_Count) {
                    Max_Count = Count;
                }

                // Updating minimum length
                if (Count < Min_Count && Count != 0) {
                    Min_Count = Count;
                }

                Count = 0; // Resetting counter for next word
            }
            else {
                Count++; // Counting letters of the word
            }
        }

        // Checking the last word (because no space at the end)
        if (Count > Max_Count) {
            Max_Count = Count;
        }
        if (Count < Min_Count && Count != 0) {
            Min_Count = Count;
        }

        // Printing the result
        System.out.println("Longest Letter's length is: " + Max_Count);
        System.out.println("Smallest Letter's length is: " + Min_Count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine(); // Taking input from the user

        char[] Array = Str.toCharArray(); // Converting string into character array
        maxCount(Array); // Calling the method
    }
}
