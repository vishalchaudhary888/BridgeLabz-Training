import java.util.Scanner;

public class SmallestAndLargestOfThree {
    public static void FindSmallestAndLargest(int num1, int num2, int num3) {

        // Largest
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Largest is " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Largest is " + num2);
        } else {
            System.out.println("Largest is " + num3);
        }

        // Smallest
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("Smallest is " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("Smallest is " + num2);
        } else {
            System.out.println("Smallest is " + num3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        FindSmallestAndLargest(num1,num2,num3);
    }
}
