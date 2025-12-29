import java.util.Scanner;

public class Factorial {
    //Function for calculating the factorial of a number
    public static int FactorialOf(int num){
        if(num==1){
            return 1;
        }
        return num*FactorialOf(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get the Factorial--> ");
        int number = sc.nextInt();
        System.out.println("Factorial of the given number is--> "+FactorialOf(number));
    }
}
