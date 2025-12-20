import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] Height = new double[11];
        double Sum = 0;
        for(int i=0;i<11;i++){
            Height[i] = sc.nextDouble();
            Sum+=Height[i];
        }
        System.out.print(Sum/11);
    }
}
