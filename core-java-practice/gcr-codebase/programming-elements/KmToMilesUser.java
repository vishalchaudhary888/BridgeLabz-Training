import java.util.Scanner;
public class KmToMilesUser{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double Km = sc.nextDouble();
		System.out.print("The total miles is "+(Km*1.6)+" mile for the given "+Km+"KM");
	}
}
