import java.util.Scanner;
public class ArmStrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int temp = Number;
        int Sum = 0;
        int lastdigit = 0;
        while(temp!=0){
            lastdigit = temp%10;
            temp/=10;
            Sum+=(lastdigit*lastdigit*lastdigit);
        }
        if(Sum==Number){
            System.out.print("Yes a Armstrong number");
        }
        else{
            System.out.print("Not a Armstrong number");
        }
    }
}