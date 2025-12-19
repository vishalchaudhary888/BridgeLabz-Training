import java.util.Scanner;
public class Price{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Price = sc.nextInt();
		int Quantity = sc.nextInt();
		System.out.print("The total purchase price is INR "+Price+" if the quantity "+Quantity+" and unit price is INR "+Price*Quantity);
	}
}

