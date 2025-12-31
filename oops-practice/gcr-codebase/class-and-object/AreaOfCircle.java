//Defining class
class AreaCircumference{
    //Defining attributes
    private double radius;
    //Constructor
    AreaCircumference(double radius){
        this.radius = radius;
    }
    //Methods to calculate and display circumference and area of circle
    public void displayCircumference(){
        System.out.println("Circumference of circle: "+(2*3.14*radius)+" units");
    }
    public void displayArea(){
        System.out.println("Area of circle: "+(3.14*radius*radius)+ " units");
    }
    public void display(){
        displayArea();
        displayCircumference();
    }
}
public class AreaOfCircle {
    public static void main(String[] args) {
        //Object creation and passing arguments
        AreaCircumference circle1 = new AreaCircumference(15);
        circle1.display();//calling function to display
    }
}
