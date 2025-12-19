import java.util.Scanner;
public class YardAndMile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double Feet = sc.nextDouble();
		double Yard = Feet*3;
		double Mile = Yard*1760;
		System.out.print("Your height in cm is "+Feet*2.54+" while in feet is "+Feet+" and yard is "+Yard);
	}
}

