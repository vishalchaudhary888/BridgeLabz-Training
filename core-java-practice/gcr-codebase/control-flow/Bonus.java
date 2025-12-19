import java.util.Scanner;
public class Bonus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Salary = sc.nextInt();
        int Experience = sc.nextInt();
        if(Experience>5){
            System.out.print("Bonus amount is "+(Salary/20));
        }
        else{
            System.out.print("Not Eligible for Bonus");
        }
    }
}