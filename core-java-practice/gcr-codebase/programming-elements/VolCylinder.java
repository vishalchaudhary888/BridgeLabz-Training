import java.util.Scanner;
public class VolCylinder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double Radius  = sc.nextDouble();
		double Height  = sc.nextDouble();
		System.out.print("Volume of cylinder is: "+(3.14*Radius*Radius*Height)+"Unit^3");
	}
}

