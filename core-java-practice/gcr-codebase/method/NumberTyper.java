import java.util.Scanner;

public class NumberTyper {
    public static int FindType(int number){
        if(number<0){
            return -1;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        System.out.println(FindType(number));

    }
}
