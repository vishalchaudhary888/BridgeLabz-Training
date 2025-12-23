import java.util.Scanner;

public class StringToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.next();
        char[] ManualArray = new char[Str.length()];
        ManualArray = ManualWay(Str);
        char[] Array = new char[Str.length()];
        Array = Str.toCharArray();
        for(int i=0;i<Str.length();i++){
            if(ManualArray[i]==Array[i]){
                System.out.print("True, ");
            }
            else{
                System.out.println("False, ");
            }
        }
    }

    public static char[] ManualWay(String Str){
        char[] Array = new char[Str.length()];
        //Putting each character of the String into the Array of character
        for(int i=0;i<Str.length();i++){
            Array[i] = Str.charAt(i);
        }
        return Array;

    }
}
