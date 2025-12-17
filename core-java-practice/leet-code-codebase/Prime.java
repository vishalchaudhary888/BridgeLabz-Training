import java.util.Scanner;
public class Prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		for(int i=2;i<=num/2;i++){
			if(num%i == 0){
				System.out.print("Not a Prime Number\n");
				break;
			}
		}
		System.out.print("In case you see blank it means it's Prime Number");
	}
}


