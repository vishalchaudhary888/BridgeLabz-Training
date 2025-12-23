import java.util.Scanner;

public class IlleagleArgumentExcepti{

    //Generating Runtime Exception
    public static void generateException(String str) {
        System.out.println(str.substring(5, 2));
    }

    //Handling Runtime Exception using try-catch
    public static void handleException(String str) {

        try {
            System.out.println(str.substring(4,1));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index is invalid");
        }
        catch (RuntimeException e) {
            System.out.println("Runtime exception handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking String input
        System.out.print("Enter a string: ");
        String str = sc.next();

        // Calling method to generate exception
        try {
            generateException(str);
        }
        catch (RuntimeException e) {
            System.out.println("Exception generated and program stopped");
        }
        handleException(str);
    }
}
