public class DiscountedFee{
	public static void main(String[] args){
		int Fee = 125000;
		int DiscountPerc = 10;
		float Discount = (125000*DiscountPerc)/100;
		System.out.print("The discount amount is INR "+Discount+" and final discount from the fee is INR "+(Fee-Discount));
	}
}

