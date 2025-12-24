import java.util.Scanner;

public class SpringSeason {
    public static void IsSpring(int day,int month){
        if(month>=4 && month<=5){
            System.out.println("Spring Season");
        }
        else if((month==3 && day>=20) || (month==6 && day<=20)){
            System.out.println("Spring Season");
        }
        else{
            System.out.println("Not a Spring Season");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        IsSpring(day,month);
    }
}
