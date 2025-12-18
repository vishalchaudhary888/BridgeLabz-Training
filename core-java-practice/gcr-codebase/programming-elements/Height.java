import java.util.Scanner;
public class Height{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double height  = sc.nextDouble();
		double inches = height/2.54;
		double feet = inches/12;
		System.out.print("Height in cm is "+height+" while in feet is "+feet+" and in inches is "+inches);
	}
}
