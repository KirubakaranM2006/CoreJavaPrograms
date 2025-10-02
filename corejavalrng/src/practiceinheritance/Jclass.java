//hierchical inheritance
//1superclass->2subclass is called->hierchicalInheritance

package practiceinheritance;

class Animal{
	String name;
	int age;
	void makesound(){
		System.out.println("Animal makes a sound");
		
	}
	
}
class Dog extends Animal{
	String breed;
	@Override//sub class used to custamize method from animal class(superclass	)
	void makesound() {
		System.out.println("Dog barks");
	}
	void fetch() {
		System.out.println("Dog is fetching");
	}
	
}

class Cat extends Animal{
	String color;
	@Override//child class used to custamize method from animal class (superclass)
	void makesound() {
		System.out.println("cat meows");
		
	}
	void climb() {
		System.out.println("cat is climbing");
	}
}

public class Jclass {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.name="tom";
		d.age=2;
		d.breed="labrador";
		d.makesound();
		d.fetch();
		
		Cat c=new Cat();
		c.name="jerry";
		c.age=2;
		c.color="white";
		c.makesound();
		c.climb();
		
		
	}

}
