import java.util.Scanner;
public class SwitchCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Number1 = sc.nextInt();
        char Operator = sc.next().charAt(0);
        int Number2 = sc.nextInt();
        switch(Operator){
            case '+':
                System.out.print(Number1+Number2);
                break;
            case '-':
                System.out.print(Number1-Number2);
                break;
            case '*':
                System.out.print(Number1*Number2);
                break;
            case '/':
                System.out.print(Number1/Number2);
                break;
            default:
                System.out.print("Enter valid input!!");
        }
    }
}