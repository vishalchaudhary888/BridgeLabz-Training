import java.util.Scanner;
public class PowerOfNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Base = sc.nextInt();
        int Power = sc.nextInt();
        int Result = 1;
        int i=1;
        while(i<=Power){
            Result*=Base;
            i++;
        }
        System.out.print(Result);
    }
}
