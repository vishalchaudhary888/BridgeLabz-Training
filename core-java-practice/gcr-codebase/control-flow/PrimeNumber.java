import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        boolean flag = true;
        for(int i=2;i<=Number/2;i++){
            if(Number%i==0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.print("Not a Prime Number");
        }
        else{
            System.out.print("A prime Number");
        }
    }
}