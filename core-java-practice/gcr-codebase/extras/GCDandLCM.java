import java.util.Scanner;

public class GCDandLCM {
    //Function for finding the greatest common divisor(GCD)
    public static void GCD(int num1, int num2){
        if(num1<num2){
            for(int i=num1;i>=1;i--){
                if(num1%i==0 && num2%i==0){
                    System.out.println("GCD is--> "+i);
                    break;
                }
            }
        } else{
            for(int i=num2;i>=1;i--){
                if(num1%i==0 && num2%i==0){
                    System.out.println("GCD is--> "+i);
                    break;
                }
            }
        }
    }
    //Function for finding the Least common multiple(LCM)
    public static void LCM(int num1, int num2){
        if(num1>num2){
            int lcm = num1;
            while(true){
                if(lcm%num1==0 && lcm%num2==0){
                    System.out.println("LCM is--> "+lcm);
                    break;
                }
                lcm++;
            }
        }
        else{
            int lcm = num2;
            while(true){
                if(lcm%num1==0 && lcm%num2==0){
                    System.out.println("LCM is--> "+lcm);
                    break;
                }
                lcm++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 =  sc.nextInt();
        LCM(number1,number2);
        GCD(number1,number2);
    }
}
