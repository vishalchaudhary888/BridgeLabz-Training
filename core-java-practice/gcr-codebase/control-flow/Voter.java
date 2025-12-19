import java.util.Scanner;
public class Voter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();
        if(Age >=18){
            System.out.print("The person's age is "+Age+" and can vote");
        }
        else{
            System.out.print("The person's is "+Age+" and cannot vote");
        }
    }
}