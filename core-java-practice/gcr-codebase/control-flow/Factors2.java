import java.util.Scanner;
public class Factors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int i=1;
        while(number!=i){
            if(Number%i==0){
                System.out.print(i+", ");
            }
            i++;
        }
    }
}