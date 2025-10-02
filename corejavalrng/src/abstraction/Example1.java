package abstraction;

//Abstraction is the process of hiding internal implementation details and showing only the essential features to the user.
//When using classes, abstraction is achieved with the abstract keyword.
// Key Points or (rules):
//Use abstract keyword to declare a class abstract.
//Abstract classes can have both:
//abstract methods (no body)
//concrete methods or normal methods (with body) 
//You cannot create an object of an abstract class.
//Subclasses must override all abstract methods.

//Abstract class
abstract class Animal {
 // Abstract method (no body) or  ACTION (only tells what should happen, no body)
 abstract void makeSound();

 // Concrete method (has body)
 void sleep() {
     System.out.println("Sleeping...");
 }
}

//Subclass Dog
class Dog extends Animal {
 // Must override abstract method{implementing makesound()
 void makeSound() {
     System.out.println("Dog barks");
 }
}

//Subclass Cat
class Cat extends Animal {
 // Must override abstract method{implementing makesound()}
 void makeSound() {
     System.out.println("Cat meows");
 }
}

//Main class
public class Example1 {
 public static void main(String[] args) {
     Dog d = new Dog();
     d.makeSound();  // Dog barks   // Calls implementation in Dog

     d.sleep();      // Sleeping...  // Uses normal method from Animal

     Cat c = new Cat();
     c.makeSound();  // Cat meows    // Calls implementation in Cat
     c.sleep();      // Sleeping...   // Uses normal method from Animal
 }
}
//Animal is an abstract class.

//It hides the logic of how makeSound() works — it just says: "There will be a sound".

//The actual sound ("Dog barks", "Cat meows") is defined in the subclasses (Dog, Cat).

//So the implementation is hidden and only the important action is shown → this is abstraction.



//Action-> shown	Method name (like makeSound)
//Implementation->	The code inside the method that runs the action
//Abstraction->	Showing only the action, hiding the implementation