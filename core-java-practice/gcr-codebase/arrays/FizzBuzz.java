import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        String[] Array = new String[Number];
        for(int i=1;i<=Number;i++){
            if(i%3==0 && i%5==0){
                Array[i-1] = "FizzBuzz";
            }
            else if(i%3==0){
                Array[i-1] = "Fizz";
            }
            else if(i%5==0){
                Array[i-1] = "Buzz";
            }
            else{
                Array[i-1] = String.valueOf(i);
            }
        }
        System.out.print(Arrays.toString(Array));
    }
}
