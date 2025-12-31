class Student {
    private String name;
    private String rollNumber;
    private int[] marks;

    // Constructor
    Student(String name, String rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate total marks
    public int totalMarks() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum;
    }

    // Method to calculate grade
    public char grade() {
        int total = totalMarks()/marks.length;

        if (total >= 90) {
            return 'A';
        } else if (total >= 80) {
            return 'B';
        } else if (total >= 70) {
            return 'C';
        } else {
            return 'D';
        }
    }

    // Method to display student report
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll Number: " + rollNumber);
        System.out.println("Student Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Grade: " + grade());
        System.out.println("---------------------");
    }
}

public class StudentReport {
    public static void main(String[] args) {

        Student ram = new Student("Ram", "ECE001", new int[]{89, 87, 88});
        ram.display();
    }
}
