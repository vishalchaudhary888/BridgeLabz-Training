import java.util.Scanner;
public class DivMode{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print("The quotient is "+(num1/num2)+" and Remainder is "+(num1%num2)+" of the two numbers");
	}
}

