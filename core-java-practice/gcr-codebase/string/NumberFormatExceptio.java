import java.util.Scanner;

public class NumberFormatExceptio {
    public static void ExceptionGenerator(String str){
        Integer.parseInt(str);
    }
    public static void ExceptionHandler(String str){
        try{
            Integer.parseInt(str);
        }
        catch (NumberFormatException e){
            System.out.print("Unchangable data type");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.next();

        ExceptionHandler(Str); //this will handle the error
        ExceptionGenerator(Str);//this will generate the error

    }
}
