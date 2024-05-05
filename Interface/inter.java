// Define an interface named Animal
interface Animal {
    // Method signatures
    void eat();
    void sleep();
}

// Implement the Animal interface in a class named Dog
class Dog implements Animal {
    // Implementing the eat method
    public void eat() {
        System.out.println("Dog is eating");
    }

    // Implementing the sleep method
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

// Implement the Animal interface in a class named Cat
class Cat implements Animal {
    // Implementing the eat method
    public void eat() {
        System.out.println("Cat is eating");
    }

    // Implementing the sleep method
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}

public class inter {
    public static void main(String[] args) {
        // Creating instances of Dog and Cat
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling methods on Dog and Cat objects
        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();
    }
}
