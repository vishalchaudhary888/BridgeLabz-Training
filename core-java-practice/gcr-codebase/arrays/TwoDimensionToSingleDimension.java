import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionToSingleDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] Array1 = new int[3][3]; //Creating a 2D Array of fixed size
        int [] Array2 = new int[9]; // Creating 1D Array of the size of Row*Column of the 2D Array
        int counter = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Array1[i][j] = sc.nextInt(); // Taking input from the user in 2D array
                Array2[counter] = Array1[i][j];// Copying the Elements of 2D Array
                counter++;
            }
        }
        System.out.print(Arrays.toString(Array2));//Printing the Array using Arrays.toString()

    }
}
