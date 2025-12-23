import java.util.Scanner;

public class TrailingAndLeadingSpaces {
    public static String RemoveSpace(String Str){
        String result = "";
        int start = 0;
        int end = Str.length()-1;

        while (start <= end && Str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && Str.charAt(end) == ' ') {
            end--;
        }
        for(int i = start;i<=end;i++){
            result = result+Str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String Str = sc.nextLine();


        System.out.println(RemoveSpace(Str));
        System.out.println(Str.trim());
        System.out.println(RemoveSpace(Str).equals(Str.trim()));

    }
}
