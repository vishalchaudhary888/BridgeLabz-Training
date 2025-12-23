import java.util.Scanner;

public class StringLength {
    public static int Length(String Str){
        int length = 0;
        try {
            while (true) {
                Str.charAt(length);
                length++;
            }
        }
        catch (StringIndexOutOfBoundsException e){
            return length;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.next();
        System.out.println("Length of the String is: "+Length(Str));


    }
}
