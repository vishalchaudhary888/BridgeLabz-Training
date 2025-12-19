import java.util.Scanner;
public class CelToFar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double Cel = sc.nextDouble();
		double Far = (Cel * 9/5)+32;
		System.out.print("Temperature in Farenheight is: "+Far);
	}
}

