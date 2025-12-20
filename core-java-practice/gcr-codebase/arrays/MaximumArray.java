import java.util.Arrays;
import java.util.Scanner;

public class MaximumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int currentSize = 0;
        int sum = 0;
        int lastNumber = input.nextInt();
        while (lastNumber > 0 && currentSize < 10) {
            array[currentSize] = lastNumber;
            sum += lastNumber;
            currentSize++;
            if (currentSize < 10) {
                lastNumber = input.nextInt();
            }
        }

        for(int i=0;i<10;i++){
            System.out.print(array[i]+", ");
        }
        System.out.print("\n"+sum);
    }
}
