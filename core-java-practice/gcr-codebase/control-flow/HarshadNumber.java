import java.util.Scanner;
public class HarshadNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Number  = sc.nextInt();
        int TemperaryNumber = Number;
        int Sum = 0;
        while(TemperaryNumber!=0){
            Sum+=(TemperaryNumber%10);
            TemperaryNumber/=10;
        }
        if(Number%Sum==0){
            System.out.print("It's a Harshad Number");
        }
        else{
            System.out.print("It's not a Harshad Number");
        }
    }
}