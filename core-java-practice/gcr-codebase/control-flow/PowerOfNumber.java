import java.util.Scanner;
public class PowerOfNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Base = sc.nextInt();
        int Power = sc.nextInt();
        int Result = 1;
        for(int i = 1;i<=Power;i++){
            Result*=Base;
        }
        System.out.print(Result);
    }
}