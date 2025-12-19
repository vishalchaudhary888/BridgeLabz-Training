import java.util.Scanner;
public class CountDown{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while(count!=0){
            System.out.println(count);
            count--;
        }
    }
}