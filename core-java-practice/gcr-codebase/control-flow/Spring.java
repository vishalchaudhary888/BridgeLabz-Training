import java.util.Scanner;
public class Spring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Day = sc.nextInt();
        int Month = sc.nextInt();
        if((Month == 3 && Day>=20)||(Month == 4 || Month==5)||(month == 6 && Day<=20)){
            System.out.print("It's a Spring Season");
        }
        else{
            System.out.print("Its Not a Spring Season");
        }
    }
}