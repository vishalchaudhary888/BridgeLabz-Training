import java.util.Scanner;
public class AreaOfTri{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Base = sc.nextInt();
		int Height = sc.nextInt();
		double AreaInCm = 0.5*Base*Height;
		double AreaInInches = (AreaInCm)/(2.54*2.54);
		System.out.print("Area in cm and inches are: "+AreaInCm+", "+ AreaInInches);
	}
}

