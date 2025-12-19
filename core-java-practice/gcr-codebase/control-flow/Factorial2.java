import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double Number = sc.nextDouble();
        double Fact = 1;
        for(int i=Number;i>0;i--){
            Fact*=Number;
            Number--;
        }
        System.out.print(Fact);
    }
}