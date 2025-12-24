import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void CalculateSum(int number){
        int sum = 0;
        for(int i=1;i<=number;i++){
            sum+=i;
        }
        System.out.println("Sum is: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        CalculateSum(number);

    }
}
