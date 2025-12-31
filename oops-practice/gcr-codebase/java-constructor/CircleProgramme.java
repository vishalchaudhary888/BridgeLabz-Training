
class Circle {
    double radius;
    // Default constructor
    Circle() {
        this(1.0); // constructor chaining
    }
    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }
    void display() {
        System.out.println("Radius: " + radius);
    }
}

public class CircleProgramme {
    public static void main(String[] args) {
        Circle Number1 = new Circle(45);
        Number1.display();
    }
}
