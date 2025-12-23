import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input of Two String from the user
        String Str1 = sc.next();
        String Str2 = sc.next();
        boolean flag = true;
        //Comparing Strings using the .charAt function
        for(int i=0;i<Str1.length();i++){
            if(Str1.charAt(i)!=Str2.charAt(i)){
                flag = false;
            }
        }

        //Comparing the Strings using .equals() method
        boolean result = Str1.equals(Str2);
        //Printing the result got using both the Function
        System.out.print("Result using .charAt(): "+flag+"\n");
        System.out.print("Result using .equals(): "+result);
    }
}
