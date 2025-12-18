import java.util.Scanner;
public class Handshakes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int students = sc.nextInt();
		System.out.print("Possible handshakes are: " +((students*(students-1))/2));
	}
}

