package OOP.Polymorphism;

// Abstract class
abstract class Animal {
  // Abstract method
  abstract void makeSound();
}

// Concrete subclass
class Dog extends Animal {
  // Implementation of abstract method
  void makeSound() {
    System.out.println("Woof");
  }
}

// Concrete subclass
class Cat extends Animal {
  // Implementation of abstract method
  void makeSound() {
    System.out.println("Meow");
  }
}

public class MainOverriding {
  public static void main(String[] args) {
    // Animal animal = new Animal(); // This line will cause an error because you
    // cannot instantiate an abstract class
    Animal dog = new Dog();
    Animal cat = new Cat();

    dog.makeSound(); // Output: Woof
    cat.makeSound(); // Output: Meow
  }
}