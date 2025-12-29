import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;

        int number = random.nextInt(max - min + 1) + min;

        System.out.println("Think of a number between 1 and 100");

        while (true) {
            System.out.println(
                    "Is your number smaller, greater, or equal to " + number + " ?"
            );

            String userInput = sc.nextLine().toLowerCase();

            if (userInput.equals("smaller")) {
                max = number - 1;
                number = random.nextInt(max - min + 1) + min;
            }
            else if (userInput.equals("greater")) {
                min = number + 1;
                number = random.nextInt(max - min + 1) + min;
            }
            else if (userInput.equals("equal")) {
                break;
            }
            else {
                System.out.println("Please type: smaller, greater, or equal");
            }
        }

        System.out.println("You are thinking of number --> " + number);
        sc.close();
    }
}
