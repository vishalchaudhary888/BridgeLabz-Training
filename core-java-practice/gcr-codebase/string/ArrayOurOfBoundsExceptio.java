import java.lang.reflect.Array;

public class ArrayOurOfBoundsExceptio {
    //This function will Generate the Error
    public static void ErrorGenerator(int[] arr){
        System.out.print(arr[arr.length]);
    }
    //This function will Handle the Error
    public static void ErrorHandler(int [] arr){
        try{
            System.out.print(arr[arr.length]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print("You are trying to find the element out of the index of the array");
        }
    }
    public static void main(String[] args) {
        int[] Array = new int[5];
        ErrorGenerator(Array);//It is Generating the Error
        ErrorHandler(Array);//It is Handling the error by printing a warning
    }
}
