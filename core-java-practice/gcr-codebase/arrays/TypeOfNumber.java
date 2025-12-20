import java.util.Scanner;

public class TypeOfNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] Array = new int[5];
        for(int number = 0; number<5; number++){
            Array[number] = input.nextInt();
        }
        for(int number = 0;number<5;number++){
            if(Array[number]==0){
                System.out.println("Zero");
            } else if (Array[number]<0) {
                System.out.println("Negative");
            }
            else{
                if(Array[number]%2==0){
                    System.out.println("Even Positive");
                }
                else{
                    System.out.println("Odd Positive");
                }
            }
        }
    }
}
