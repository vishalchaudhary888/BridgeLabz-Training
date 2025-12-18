import java.util.Scanner;
public class AreaOfTri{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int height = sc.nextInt();
		double areacm = 0.5*base*height;
		double areain = (areacm)/(2.54*2.54);
		System.out.print("Area in cm and inches are: "+areacm+", "+ areain);
	}
}

