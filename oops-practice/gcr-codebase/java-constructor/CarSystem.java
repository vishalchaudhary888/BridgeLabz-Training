
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500;

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println(customerName + " | " + carModel +
                " | Total Cost: ₹" + calculateTotalCost());
    }
}

public class CarSystem {
    public static void main(String[] args) {
        CarRental audi = new CarRental("Vishal","Audi",20);
        audi.display();
    }
}
