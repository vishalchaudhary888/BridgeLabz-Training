import java.util.Scanner;

public class SimpleInterest {
    public static void SI(int p,int r,int t){
        int si = (p*r*t)/100;
        System.out.println("The Simple Interest is "+si+" for the principle "+p+", Rate of the Interest "+r+" and Time "+t);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Principle = sc.nextInt();
        int Rate = sc.nextInt();
        int Time = sc.nextInt();
        SI(Principle,Rate,Time);
    }
}
