import java.util.Scanner;
public class Power{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double Base = sc.nextDouble();
		double Exponent = sc.nextDouble();
		double Result = Math.pow(Base,Exponent);
		System.out.print(Result);
	}
}

		
