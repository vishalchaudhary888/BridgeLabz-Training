import java.util.Scanner;
public class Grades{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Physics = sc.nextInt();
        int Chemistry = sc.nextInt();
        int Maths = sc.nextInt();
        int Percentage = (100*(Physics+Chemistry+Maths))/300;
        if(Percentage>=80){
            System.out.print(Percentage+"Level 4, above agency-normalized standards with grade 'A'");
        }
        else if(Percentage>=70){
            System.out.print(Percentage+"Level 3, at agency-normalized standards with grade 'B'");
        }
        else if(Percentage>=60){
            System.out.print(Percentage+"Level 2, below, but approaching agency-normalized standards with grade 'C'");
        }
        else if(Percentage>=50){
            System.out.print(Percentage+"Level 1, well below agency-normalized standards with grade 'D'");
        }
        else if(Percentage>=40){
            System.out.print(Percentage+"Level 1-, too below agency-normalized standards with grade 'E'");
        }
        else{
            System.out.print(Percentage+"Remedial standards with grade 'R'");
        }
    }
}