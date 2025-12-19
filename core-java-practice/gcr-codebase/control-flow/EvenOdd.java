import java.util.Scanner;
public class EvenOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();
		System.out.print("Odd     Even\n");
		for(int i=1;i<=Number;i++){
			if(i%2!=0){
				System.out.print(i+"     ");
			}
			else{
				System.out.print(i+"\n");
			}
		}
	}
}
