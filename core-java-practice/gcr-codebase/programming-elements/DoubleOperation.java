import java.util.Scanner;
public class DoubleOperation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.print("Results of the operations are--> "+(a+b*c)+", "+(a*b+c)+", "+ (c+a/b)+", "+ (a%b+c));
	}
}

