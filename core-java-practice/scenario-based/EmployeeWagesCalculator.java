import java.util.Random;

class EmployeeWage {

    // Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    // Method to calculate employee wage
    public void calculateEmployeeWage() {

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalSalary = 0;

        Random random = new Random();

        while (totalWorkingDays < MAX_WORKING_DAYS &&
                totalWorkingHours < MAX_WORKING_HOURS) {

            totalWorkingDays++;
            int empHours = 0;

            int empCheck = random.nextInt(3);

            switch (empCheck) {
                case IS_FULL_TIME:
                    empHours = 8;
                    break;

                case IS_PART_TIME:
                    empHours = 4;
                    break;

                default:
                    empHours = 0;
            }

            totalWorkingHours += empHours;
            int dailyWage = empHours * EMP_RATE_PER_HOUR;
            totalSalary += dailyWage;

            System.out.println("Day " + totalWorkingDays +" | Hours Worked: " + empHours +" | Daily Wage: ₹" + dailyWage);
        }

        System.out.println("\nTotal Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Employee Salary: ₹" + totalSalary);
    }
}

public class EmployeeWagesCalculator {
    public static void main(String[] args) {

        // Welcome message (as requested)
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch\n");

        EmployeeWage empWage = new EmployeeWage();
        empWage.calculateEmployeeWage();
    }
}
