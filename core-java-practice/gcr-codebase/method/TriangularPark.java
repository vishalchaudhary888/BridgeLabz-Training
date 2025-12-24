import java.util.Scanner;

public class TriangularPark {
    public static void calculateRounds(float s1, float s2, float s3){
        float s = (s1+s2+s3)/1000;
        float rounds = 5/s;
        System.out.println("Total Rounds are: "+rounds);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float s1 = sc.nextFloat();
        float s2 = sc.nextFloat();
        float s3 = sc.nextFloat();
        float s = s1+s2+s3;
        calculateRounds(s1,s2,s3);
    }
}
