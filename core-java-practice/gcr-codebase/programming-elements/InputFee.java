import java.util.Scanner;
public class InputFee{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float fee = sc.nextFloat();
		float DP = sc.nextFloat();
		float discount = (fee*DP)/100;
		System.out.print("The discount amount is INR "+(discount)+" and the final discounted from the fee is INR "+(fee-discount));
	}
}

