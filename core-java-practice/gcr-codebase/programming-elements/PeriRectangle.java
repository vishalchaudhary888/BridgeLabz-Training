import java.util.Scanner;
public class PeriRectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Length = sc.nextInt();
		int Breadth = sc.nextInt();
		System.out.print("Perimeter of Rectangle is: "+(2*(Length+Breadth)));
	}
}
