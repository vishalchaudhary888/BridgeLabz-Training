import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Number = input.nextInt();
        int[] ResultArray = new int[10];
        for(int i=0;i<10;i++){
            ResultArray[i] = Number*(i+1);
            System.out.println(Number+"*"+(i+1)+"="+ResultArray[i]);
        }
    }
}
