import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();
        if(Year%4==0 &&Year%100==0){
            System.out.print("Yes it's a leap year");
        }
        else{
            System.out.print("No it's not a leap year");
        }
    }
}