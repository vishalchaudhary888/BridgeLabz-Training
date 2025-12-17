import java.util.Scanner;
public class VolCylinder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double radius  = sc.nextDouble();
		double height  = sc.nextDouble();
		System.out.print("Volume of cylinder is: "+(3.14*radius*radius*height)+"Unit^3");
	}
}

