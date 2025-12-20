import java.util.Arrays;
import java.util.Scanner;
public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] OddArray = new int[(num/2)+1];
        int Oddpointer = 0;
        int [] EvenArray = new int[num/2];
        int Evenpointer = 0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                EvenArray[Evenpointer] = i;
                Evenpointer++;
            }
            else{
                OddArray[Oddpointer] = i;
                Oddpointer++;
            }
        }
        System.out.println(Arrays.toString(OddArray));
        System.out.print(Arrays.toString(EvenArray));
    }
}
