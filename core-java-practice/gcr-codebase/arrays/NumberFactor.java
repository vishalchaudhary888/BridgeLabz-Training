import java.util.Arrays;
import java.util.Scanner;

public class NumberFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int[] maxFactor = new int[10];
        int FacotorNo = 0;
        for(int i=1;i<=Number;i++){
            if(Number%i==0){
                maxFactor[FacotorNo] = i;
                FacotorNo++;
            }
        }
        System.out.print(Arrays.toString(maxFactor));
    }
}
