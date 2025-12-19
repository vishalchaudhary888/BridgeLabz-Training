import java.util.Scanner;
public class BMIcalculator{
    public static class void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        double BMI = weight/(height*height);
        if(BMI<=18.4){
            System.out.print("Underweight");
        }
        else if(BMI>18.4 && BMI<=24.9){
            System.out.print("Normal");
        }
        else if(BMI>=25 && BMI<=39.9)[
            System.out.print("Overweight");
        ]
        else{
            System.out.print("Obese");
        }
    }
}