//One superclass+Two sub classess is called Hierchical Inheritance
//Object can access only its class and the parentclass(superclass)
package hierchicalInheritance;

class Animal{// (super class)
	void eat() {
		System.out.println("animal can eat");
	}
}
class Dog extends Animal{// (subclass)->only has access dog class and animal class
	void barks() {
		System.out.println("Dog barks");
	}
	
}
class Cat extends Animal{// (subclass)->cat access only cat class and animal class
	void meow() {
		System.out.println("Cat meows");
	}
}


public class Vclass {

	public static void main(String[] args) {
		Cat k =new Cat();
		k.meow();//calling cat class
		k.eat();//calling animal class
		
		Dog d=new Dog();
		d.barks();//calling dog class
		d.eat();//calling animal class
	}

}
