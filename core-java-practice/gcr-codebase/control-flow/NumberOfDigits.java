import java.util.Scanner;
public class NumberOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int count = 0;
        while(Number!=0){
            count++;
            Number/=10;
        }
        System.out.print(count);
    }
}