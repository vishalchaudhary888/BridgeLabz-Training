import java.util.Scanner;
public class GreatestFactor{
    public class void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int i = Number-1;
        while(i>0){
            if(Number%i==0){
                System.out.print(i);
                break;
            }
            i--;
        }
    }
}