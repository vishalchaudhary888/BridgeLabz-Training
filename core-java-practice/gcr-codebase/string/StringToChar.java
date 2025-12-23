import java.util.Arrays;
import java.util.Scanner;

public class StringToChar {
    //This function is splitting the Array using the Split function
    public static char[] SplitMethod(String str){
        char[] Array = str.toCharArray();
        return Array;
    }
    //This function is comparing both the Strings
    public static boolean CompareArray(char[] Arrays1, char[] Array2){
        if(Arrays1.length!=Array2.length){
            return false;
        }
        for(int i=0;i<Arrays1.length;i++){
            if(Arrays1[i]!=Array2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        int length = Length.length(Str);
        char[] Array = Split.split(Str);//Converting the String into the character Array manually
        char[] Array2 = SplitMethod(Str);//here we are using the Split function
        //Printing both the Arrays
        System.out.println(Arrays.toString(Array));
        System.out.println(Arrays.toString(Array2));
        //Printing the comaprison result of both the Arrays
        System.out.println("Result: "+CompareArray(Array,Array2));
    }
}
