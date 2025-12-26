import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        String NewString = "";
        for(int i=Str.length()-1;i>=0;i--){
            NewString = NewString+Str.charAt(i);
        }
        System.out.println("Reverse String is: "+NewString);
    }
}
