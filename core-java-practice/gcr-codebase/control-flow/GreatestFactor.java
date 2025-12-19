import java.util.Scanner;
public class GreatestFactor{
    public class void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        for(int i=Number-1;i>0;i--){
            if(Number%i==0){
                System.out.print(i);
                break;
            }
        }
    }
}