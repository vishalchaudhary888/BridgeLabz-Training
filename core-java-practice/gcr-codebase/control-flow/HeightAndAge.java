import java.util.Scanner;
public  class HeightAndAge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int firstHeight = sc.nextInt();
        int firstAge = sc.nextInt();
        int secondHeight = sc.nextInt();
        int secondAge = sc.nextInt();
        int thirdHeight = sc.nextInt();
        int thirdAge = sc.nextInt();
        if(firstHeight>secondHeight){
            if(firstHeight>thirdHeight){
                System.out.println("First is the tallest");
            }
        }
        else if(secondHeight>thirdHeight){
            System.out.println("Second is the tallest");
        }
        else {
            System.out.println("Third is the tallest");
        }

        if(firstAge>secondAge){
            if(firstAge>thirdAge){
                System.out.println("First is the tallest");
            }
        }
        else if(secondAge>thirdAge){
            System.out.println("Second is the tallest");
        }
        else {
            System.out.println("Third is the tallest");
        }
    }
}