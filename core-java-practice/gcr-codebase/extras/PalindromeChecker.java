import java.util.Scanner;

public class PalindromeChecker {
    //Function to check the String is Palindrome or not
    public static boolean isPalindrome(String str){
        int lastIndex = str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(lastIndex)){
                return false;
            }
            lastIndex--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, Enter the String to check if it is palindrome or not-> ");
        String str = sc.nextLine();
        if(isPalindrome(str.toLowerCase())){
            System.out.println("It is a Palindrome String!!");
        }
        else{
            System.out.println("It is not a Palindrome String!!");
        }
    }
}
