import java.util.Scanner;
public class AbundantNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int Sum = 0;
        for(int i=1;i<=Number/2;i++){
            if(Number%i==0){
                Sum+=i;
            }
        }
        if(Sum>Number){
            System.out.print("It's an Abundant Number");
        }
        else{
            System.out.print("It's not an Abundant Number");
        }
    }
}