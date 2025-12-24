import java.util.Scanner;

public class MaximumHandshakes {
    public static void PossibleHandshakes(int number){
        int combination = (number*(number-1))/2;
        System.out.println("Total possible handshakes are: "+combination);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalStudents = sc.nextInt();
        PossibleHandshakes(totalStudents);
    }
}
