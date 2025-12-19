import java.util.Scanner;
public class SumToZero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int Sum = 0;
        while(Number!=0){
            Sum+=Number;
            number = sc.nextInt();
        }
        System.out.print("Total sum is "+Sum);
    }
}