import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] AgeArray = new int[10]; // Array declaration with size

        //For loop for inputting the students age
        for(int student=0;student<10;student++){
            AgeArray[student] = input.nextInt();
        }

        //for loop for checking the students eligibility to vote
        for(int student = 0;student<10;student++){
            if(AgeArray[student]>=18){
                System.out.println("The student with the age "+AgeArray[student]+" can vote");
            }
            else if(AgeArray[student]<18 && AgeArray[student]>0){
                System.out.println("The student with the age "+AgeArray[student]+" can not vote");
            }
            else{
                System.out.println("Invalid Age!!");
            }
        }
    }
}
