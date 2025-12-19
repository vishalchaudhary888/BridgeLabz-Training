import java.util.Scanner;
public class NaturalSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>=0){
            System.out.print("The sum of "+number+" natural numbers is "+(n*(n+1)/2));
        }
        else{
            System.out.print("The number is not a natural number");
        }
    }
}