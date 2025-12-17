import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(isPalindrome(str)){
			System.out.print("Palindrome String");
		}
		else{
			System.out.print("Not a Palindrome String");
		}
	}
        public static boolean isPalindrome(String str){
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				return false;}
		}
		return true;
		}
}
