import java.util.Scanner;

public class WindChillCalculator {
    //Method to calculate the wind chill speen
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature
                + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");//Taking temperature as input from user
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed: ");//Taking wind speed as user input
        double windSpeed = sc.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);

        System.out.println("Wind Chill Temperature: " + windChill);
    }
}
