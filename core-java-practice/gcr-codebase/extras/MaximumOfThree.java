import java.util.Scanner;
public class MaximumOfThree {
    //Function for calculating teh maximum of Three Numbers
    public static int maximumOfThree(int num1,int num2,int num3){
        if(num1>num2){
            if(num1>num3){
                return num1;
            }
        }
        else{
            if(num2>num3){
                return num2;
            }
        }
        return num3;
    }
    //Function for taking the userInput
    public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, Enter the Number1--> ");
        int num1 = sc.nextInt();
        System.out.println("Please, Enter the Number2--> ");
        int num2 = sc.nextInt();
        System.out.println("Please, Enter the Number3--> ");
        int num3 = sc.nextInt();
        System.out.println("Greater Number is-> "+maximumOfThree(num1,num2,num3));

    }

    public static void main(String[] args) {
        input();
    }
}
