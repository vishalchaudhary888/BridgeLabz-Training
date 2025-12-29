import java.util.Scanner;
public class DiwaliLuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.print("Please enter the number you got--> ");
            int Number = sc.nextInt();
            System.out.println();
            if(Number%3==0 && Number%5==0){
                System.out.println("Congratulations!! You won a amazing gift");
            }
            else{
                System.out.println("Sorry! Please try again later");
            }
            System.out.println("----------------------");
            System.out.println("Do you have a Lucky Draw number");
            boolean AskUser = sc.nextBoolean();
            if(AskUser){
                flag=true;
            }
            else{
                flag = false;
            }
        }
    }
}
