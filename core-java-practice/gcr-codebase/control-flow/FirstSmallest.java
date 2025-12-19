import java.util.Scanner;
public class FirstSmallest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        if(number1<number2){
            if(number1<number3){
                System.out.print("Is the first number the smallest? Yes");
            }
        }
        else{
            System.out.print("Is the first number the smallest? No");
        }
    }
}