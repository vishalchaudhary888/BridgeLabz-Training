import java.util.Scanner;

public class QuotientAndRemainder {
    public static void FindQuotientAndRemainder(int number1,int number2){
        System.out.println("Quotient "+(number1/number2));
        System.out.println("Remainder: "+(number1%number2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        FindQuotientAndRemainder(number1,number2);
    }
}
