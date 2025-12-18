import java.util.Scanner;
public class YardAndMile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double feet = sc.nextDouble();
		double yard = feet*3;
		double mile = yard*1760;
		System.out.print("Your height in cm is "+feet*2.54+" while in feet is "+feet+" and yard is "+yard);
	}
}

