import java.util.Scanner;
public class Operations{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float Num1 = sc.nextFloat();
		float Num2 = sc.nextFloat();
		System.out.print("The addition, subtraction, multiplication and division value of 2 numbers "+(Num1)+" and "+(Num2)+" is "+(Num1+Num2)+", "+(Num1-Num2)+", "+(Num1/Num2)+", and "+(Num1*Num2));
	}
}

