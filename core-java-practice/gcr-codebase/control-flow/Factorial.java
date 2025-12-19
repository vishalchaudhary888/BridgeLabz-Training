import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double Number = sc.nextDouble();
        double Fact = 1;
        while(Number!=0){
            Fact*=Number;
            Number--;
        }
        System.out.print(Fact);
    }
}