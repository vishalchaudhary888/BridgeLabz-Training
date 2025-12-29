import java.util.Scanner;

public class FibonacciSequenceGenerator {
    //Function to Generate the Fibonacci Series
    public static void generateFibonacci(int num) {
        int first = 0;
        int second = 1;
        System.out.print(first);
        if (num > 1) {
            System.out.print(", " + second);
        }
        for (int i = 2; i < num; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, Enter the Fibonacci Series last place--> ");
        int num = sc.nextInt();
        generateFibonacci(num);

    }
}
