
class Employee{
    String name;
    int Id;
    int salary;
    Employee(String name,int Id,int salary){
        this.name = name;
        this.Id = Id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("name: "+name);
        System.out.println("Id: "+Id);
        System.out.println("salary: "+salary);
    }
}

class Manager extends Employee{
    Manager(String name,int Id,int salary,int teamSize){
        super(name,Id,salary);
        this.teamSize = teamSize;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("teamSize:"+teamSize);
    }
    public int teamSize;
}

class Developer extends Employee{
    String programmingLanguage;
    Developer(String name,int Id,int salary,String programmingLanguage){
        super(name,Id,salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language:"+programmingLanguage);
    }

}

class Intern extends Employee{
    String programmingLanguage;
    Intern(String name,int Id,int salary,String programmingLanguage){
        super(name,Id,salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language:"+programmingLanguage);
    }

}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee Chhail = new Manager("ChhailBihari",254,2500000,4);
        Employee Jatin = new Developer("Jatin",24,500000,"Java");
        Employee Vishal = new Intern("Vishal",25,25000,"Java");
        Chhail.displayDetails();
        Jatin.displayDetails();
        Vishal.displayDetails();

    }
}
