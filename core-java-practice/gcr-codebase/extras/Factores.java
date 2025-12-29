import java.util.Scanner;

public class Factores {
    public static void getFactores(int Number,int i){
        if(i>Number){
            return;
        }
        if(Number%i==0){
            System.out.print(i+", ");
        }
        getFactores(Number,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, Enter the number--> ");
        int Number = sc.nextInt();
        getFactores(Number,1);
    }
}
