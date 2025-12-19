import java.util.Scanner;
public class AllMultiples{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        if(Number>0 && Number<100){
            for(int i=Number;i>0;i--){
                if(Number%i==0){
                    System.out.print(i+", ");
                }
            }
        }
    }
}