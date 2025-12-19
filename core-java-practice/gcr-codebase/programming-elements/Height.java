import java.util.Scanner;
public class Height{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double Height  = sc.nextDouble();
		double Inches = Height/2.54;
		double Feet = Inches/12;
		System.out.print("Height in cm is "+Height+" while in feet is "+Feet+" and in inches is "+Inches);
	}
}
