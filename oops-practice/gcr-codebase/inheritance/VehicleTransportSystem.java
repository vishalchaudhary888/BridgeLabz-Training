
class Vehicle{
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public void displayInfo(){
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Fuel Type: "+fuelType);
    }
}

class Car extends Vehicle{
    int seatCapacity;
    Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity: "+seatCapacity);
    }

}
class Truck extends Vehicle{
    int weight;
    Truck(int maxSpeed,String fuelType,int weight){
        super(maxSpeed,fuelType);
        this.weight = weight;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Weight: "+weight);
    }

}

class Motorcycle extends Vehicle{
    int CC;
    Motorcycle(int maxSpeed,String fuelType,int CC){
        super(maxSpeed,fuelType);
        this.CC = CC;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("CC: "+CC);
    }
}

public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(220, "Diesel", 5);
        vehicles[1] = new Truck(120, "Diesel", 8000);
        vehicles[2] = new Motorcycle(140, "Petrol", 346);

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("-------------------");
        }
    }
}
