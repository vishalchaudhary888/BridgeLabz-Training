class Animal{
    String name;
    int age;
    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void makeSound(){
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal{
    Dog(String name, int age) {
        super(name, age);
    }

//    @Override
    public void makeSound(){
        System.out.println(name);
        System.out.println(age);
        System.out.println("Dogs bark");
    }
}
class Cat extends Animal{
    Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound(){
        System.out.println(name);
        System.out.println(age);
        System.out.println("Cats Mew-Mew");
    }
}
class Bird extends Animal{
    Bird(String name, int age) {
        super(name, age);
    }

    public void makeSound(){
        System.out.println(name);
        System.out.println(age);
        System.out.println("Birds chirping");
    }
}
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("Jerman Shephard",4);
        Animal cat = new Cat("Egyptian",2);
        Animal bird = new Bird("Sparrow",1);
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
