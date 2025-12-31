import java.util.Scanner;

//Defining class Employee
class Employee{
    //Defining attributes
    private String name;
    private int Id;
    private int salary;

    //Constructor
    Employee(String name,int Id,int salary){
        this.name = name;
        this.Id = Id;
        this.salary = salary;
    }
    //Function in Employee to display details
    public void displayDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Id: "+Id);
        System.out.println("Salary: "+salary);
    }
}
public class Employeedetails {
    public static void main(String[] args) {
        //Creating object number1 for Ram from class Employee
        Employee number1 = new Employee("Ram",112,40000);
        //Creating object number2 for Shyam from class Employee
        Employee number2 = new Employee("Shyam",117,50000);
        //Displaying the details of each employee using the function .displayDetails present in Employee class
        number1.displayDetails();
        System.out.println("<=====================>");
        number2.displayDetails();

    }
}
