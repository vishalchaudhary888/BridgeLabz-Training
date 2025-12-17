import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		double radius = sc.nextInt();
		double pi = 3.14;
		System.out.print("Area of circle is: "+ (pi*radius*radius));
	}
}
