
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public getter
    public double getCGPA() {
        return CGPA;
    }

    // Public setter
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}
class PostgraduateStudent extends Student {

    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    void display() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name); // protected access
        System.out.println("CGPA: " + getCGPA());
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Vishal", 8.5);
        pg.display();

        pg.setCGPA(9.0);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
