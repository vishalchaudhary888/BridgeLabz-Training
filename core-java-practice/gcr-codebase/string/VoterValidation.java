import java.util.Scanner;

public class VoterValidation {
    //For validating the person if eligible for vote or not
    public static void Validate(int[] Array){
        String[][] Array2 = new String[Array.length][2];
        for(int i=0;i<Array.length;i++){
            Array2[i][0] = String.valueOf(Array[i]);
            if(Array[i] >= 18){
                Array2[i][1] = "true";
            }
            else{
                Array2[i][1] = "false";
            }
        }
        for(int i=0;i<Array2.length;i++){
            for(int j=0;j<2;j++){
                System.out.print(Array2[i][j]+"   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Array = new int[10];
        for(int i=0;i<10;i++){
            Array[i] = sc.nextInt();
        }

        Validate(Array);
    }
}
