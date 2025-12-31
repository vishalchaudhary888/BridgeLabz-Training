
class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class CopyingData {
    public static void main(String[] args) {
        Person ram = new Person("Ram",25);
        ram.display();
    }
}
