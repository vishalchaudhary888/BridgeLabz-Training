abstract class Employee{
    private final String name;
    private final double salary;
    protected final double bonus;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
        this.bonus = getBonus();
    }
    double getSalary(){
        return salary;
    }
    protected abstract double getBonus();
}

class Manager extends Employee{
    Manager(String name, double salary){
        super(name,salary);
    }
    @Override
    protected double getBonus(){
        return getSalary()/10;
    }

}
class Developer extends Employee{
    Developer(String name, double salary){
        super(name,salary);
    }
    @Override
    protected double getBonus(){
        if(getSalary()>50000){
            return (getSalary()/20);
        }
        else{
            return 0.0;
        }
    }
}

public class EmployeeRole {
    public static void main(String[] args) {
        Employee manager = new Manager("Chhail",100000);
        Employee developer = new Developer("Jatin",55000);
        System.out.println(manager.getBonus());
        System.out.println(developer.getBonus());
    }
}
