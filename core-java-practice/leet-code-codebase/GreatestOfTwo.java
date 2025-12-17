import java.util.Scanner;
public class GreatestOfTwo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1  = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1>num2){
			System.out.print("First number is greater");
		}
		else if(num2>num1){
			System.out.print("Second number is greater");
		}
		else{
			System.out.print("Both are equal");
		}
	}
}
