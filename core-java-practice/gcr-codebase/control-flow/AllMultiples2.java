import java.util.Scanner;
public class AllMultiples2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int i = Number-1;
        if(Number>0 && Number<100){
            while(i>0){
                if(Number%i==0){
                    System.out.print(i+", ");
                }
                i--;
            }
        }
    }
}
