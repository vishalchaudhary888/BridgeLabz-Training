import java.util.Scanner;
public class Handshakes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Students = sc.nextInt();
		System.out.print("Possible handshakes are: " +((Students*(Students-1))/2));
	}
}

