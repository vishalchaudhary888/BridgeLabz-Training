import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int finePerDay = 5;

        for (int i = 0; i < 5; i++) {
            System.out.println("\nBook " + (i + 1));

            System.out.println("Please, Enter the return date (dd mm yyyy) -->");
            int returnDay = sc.nextInt();
            int returnMonth = sc.nextInt();
            int returnYear = sc.nextInt();

            System.out.println("Please, Enter the due date (dd mm yyyy) -->");
            int dueDay = sc.nextInt();
            int dueMonth = sc.nextInt();
            int dueYear = sc.nextInt();

            // Simple date-to-days conversion
            int returnTotalDays = returnYear * 365 + returnMonth * 30 + returnDay;
            int dueTotalDays = dueYear * 365 + dueMonth * 30 + dueDay;

            if (returnTotalDays > dueTotalDays) {
                int lateDays = returnTotalDays - dueTotalDays;
                int fine = lateDays * finePerDay;

                System.out.println("Returned late by " + lateDays + " days");
                System.out.println("Fine to pay = ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine ");
            }
        }

        sc.close();
    }
}
