import java.util.Scanner;
public class PrimeNumber {
    //Function to check the Prime Number
    public static boolean IsPrime(int Number){
        for(int i=2;i<=Number/2;i++){
            if(Number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, Enter the Number-> ");
        int number = sc.nextInt();
        if(IsPrime(number)){
            System.out.println("It is a prime Number");
        }
        else{
            System.out.println("It is not a prime Number");
        }
    }
}
