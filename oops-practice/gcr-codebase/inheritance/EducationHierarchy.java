// Base class
class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " hours");
    }
}

// Subclass
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform    : " + platform);
        System.out.println("Recorded    : " + isRecorded);
    }
}

// Subclass of OnlineCourse (Multilevel Inheritance)
class PaidOnlineCourse extends OnlineCourse {
    int fee;
    int discount;

    PaidOnlineCourse(String courseName, int duration, String platform,
                     boolean isRecorded, int fee, int discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee         : " + fee);
        System.out.println("Discount    : " + discount + "%");
    }
}

public class EducationHierarchy {
    public static void main(String[] args) {
        Course course = new PaidOnlineCourse("Java Full Stack", 120, "Udemy", true, 5000, 20);
        course.displayInfo();
    }
}
