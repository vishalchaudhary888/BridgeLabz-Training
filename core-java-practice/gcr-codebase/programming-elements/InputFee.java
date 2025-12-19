import java.util.Scanner;
public class InputFee{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float Fee = sc.nextFloat();
		float DiscountPerc = sc.nextFloat();
		float Discount = (Fee*DiscountedPerc)/100;
		System.out.print("The discount amount is INR "+(Discount)+" and the final discounted from the fee is INR "+(Fee-Discount));
	}
}

