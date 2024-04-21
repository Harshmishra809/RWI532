// compile time polymorphism   (Method Overloading):


// class Calculator {

//     // Method to add two integers
//     public int add(int a, int b) {
//         return a + b;
//     }

//     // Method to add three integers (method overloading)
//     public int add(int a, int b, int c) {
//         return a + b + c;
//     }

//     // Method to add two doubles
//     public double add(double a, double b) {
//         return a + b;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Calculator calculator = new Calculator();

//         System.out.println(calculator.add(5, 10)); // Calls add(int, int)
//         System.out.println(calculator.add(5, 10, 15)); // Calls add(int, int, int)
//         System.out.println(calculator.add(3.5, 2.5)); // Calls add(double, double)
//     }
// }


//Runtime Polymorphism (Method Overriding):



//class Animal {
//     public void makeSound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     public void makeSound() {
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Animal {
//     @Override
//     public void makeSound() {
//         System.out.println("Cat meows");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Animal myDog = new Dog(); // Dog object, Animal reference
//         Animal myCat = new Cat(); // Cat object, Animal reference

//         myDog.makeSound(); // Calls Dog's makeSound method
//         myCat.makeSound(); // Calls Cat's makeSound method
//     }
// }
