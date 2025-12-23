import java.util.Scanner;

public class StringWithNumber {
    //Method for converting Array with the Serial number of that character in 2D
    public static void MultiDimension(char[] Array,int length){
        String[][] StrArray = new String[length][2];
        int number = 1;
        for(int i=0;i<length;i++){
            for(int j=0;j<2;j++){
                if(j==0){
                    StrArray[i][j] = Array[i]+"";//Stores the character from 1D array to 2D array
                    System.out.print(StrArray[i][j]+", ");//Printing the character
                }
                else{
                    StrArray[i][j]=String.valueOf(number);//Storing the character position number
                    number++;
                    System.out.println(StrArray[i][j]);//printing the character number
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Str = sc.nextLine();//Taking input from the user

        int length = Length.length(Str);//Getting the Length of String
        char[] Array = Split.split(Str);//Splitting the String into the character Array
        MultiDimension(Array,length);//Calling the function for 2D Arrays


    }
}
