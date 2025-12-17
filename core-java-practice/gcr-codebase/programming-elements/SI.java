import java.util.Scanner;
public class SI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double p = sc.nextDouble();
		double r = sc.nextDouble();
		double t = sc.nextDouble();
		System.out.print("Simple Interest is: "+ ((p*r*t)/100));
	}
}

