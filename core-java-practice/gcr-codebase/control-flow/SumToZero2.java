import java.util.Scanner;
public class SumToZero2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int Sum = 0;
        while(Number>0){
            Sum+=Number;
            Number = sc.nextInt();
        }
        System.out.print("Total sum is "+Sum);
    }
}