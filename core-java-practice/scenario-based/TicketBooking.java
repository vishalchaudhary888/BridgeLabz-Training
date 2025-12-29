import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What type of movie do you want to watch-->");
        System.out.println("1-->Drama");
        System.out.println("2-->Comedy");
        System.out.println("3-->Horror");
        int MovieType = sc.nextInt();
        System.out.println("Enter the seat-type-->\n0-->Gold\n1-->Silver");
        int SeatType = sc.nextInt();

        int TicketPrice = 0;
        switch (MovieType){
            case 1:
                TicketPrice = 200;
                break;
            case 2:
                TicketPrice = 250;
                break;
            case 3:
                TicketPrice = 300;
                break;
            default:
                System.out.println("Please enter a valid type!!");
        }
        if(SeatType==0){
            TicketPrice+=250;
        }
        else{
            TicketPrice+=100;
        }
        System.out.println("Do you want some snacks-->y/n");
        char Snacks = sc.next().charAt(0);
        if(Snacks=='y'){
            TicketPrice +=80;
        }
        System.out.println("<================================>");
        System.out.println("Total Ticket Price is-->"+TicketPrice);

    }
}
