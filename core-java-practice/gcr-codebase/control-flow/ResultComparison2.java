import java.util.Scanner;
public class ResultComparison{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int Sum1 = 0;
        int Sum2 = Num*(Num+1)/2
        for(int i=Num;i>0;i--){
            Sum1+=Num;
            Num--;
        }
        System.out.print("Results are"+(Sum1),(Sum2));
    }
}