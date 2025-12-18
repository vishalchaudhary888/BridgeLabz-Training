public class DiscountedFee{
	public static void main(String[] args){
		int fee = 125000;
		int disPerc = 10;
		float disc = (125000*disPerc)/100;
		System.out.print("The discount amount is INR "+disc+" and final discount from the fee is INR "+(fee-disc));
	}
}

