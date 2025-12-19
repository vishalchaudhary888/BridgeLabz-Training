import java.util.Scanner;
public class NumberAstronomy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        if(Number==0){
            System.out.print("Zero");
        }
        else if(Number>0){
            System.out.print("Positive");
        }
        else{
            System.out.print("Negative");
        }
    }
}