import java.util.Scanner;
public class SI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double Principle = sc.nextDouble();
		double Rate = sc.nextDouble();
		double Time = sc.nextDouble();
		System.out.print("Simple Interest is: "+ ((Principle*Rate*Time)/100));
	}
}

